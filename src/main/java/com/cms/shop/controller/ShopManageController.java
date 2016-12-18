package com.cms.shop.controller;

import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.QaVo;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.model.ext.StreetVo;
import com.cms.shop.service.*;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-6
 */

@Controller
@RequestMapping("shopmanage")
public class ShopManageController extends BaseController{

    @Autowired
    private ArchitectureService architectureService;

    @Autowired
    private BuildingFacilityService buildingFacilityService;

    @Autowired
    private BuildingFinishingService buildingFinishingService;

    @Autowired
    private BuildingOccupancyService buildingOccupancyService;

    @Autowired
    private DistrictService districtService;

    @Autowired
    private HotcategoryService hotcategoryService;

    @Autowired
    private StreetService streetService;

    @Autowired
    private ShopTypeService shopTypeService;

    @Autowired
    private FriendService friendService;

    @Autowired
    private PartnerService partnerService;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private FlashService flashService;

    @Autowired
    private QAService qaService;

    @RequestMapping("architPage")
    @ResponseBody
    public String queryArchitPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Architecture> page =  architectureService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("archit-all")
    @ResponseBody
    public String queryArchitAll(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        List<Architecture> list = architectureService.queryAll();
        if(CollectionUtils.isNotEmpty(list)){
            result.setSuccess(true);
            result.setData(list);
        }
        return gson.toJson(result);
    }

    /**
     * 添加建筑结构
     * @param architecture
     * @return
     */
    @RequestMapping("add-archit")
    @ResponseBody
    public String addArchit(Architecture architecture){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != architecture && !StringUtils.isBlank(architecture.getArchiName())){
            boolean success = architectureService.addArchitecture(architecture);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("添加失败!");
            }
        }else{
            result.setMessage("建筑结构名称不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 删除建筑结构
     * @param id
     * @return
     */
    @RequestMapping("delete-archit")
    @ResponseBody
    public String deleteArchitAll(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            boolean success = architectureService.deleteById(id);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("操作失败!");
            }
        }
        return gson.toJson(result);
    }
    @RequestMapping("buildFaciPage")
    @ResponseBody
    public String queryBuildFaciPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<BuildingFacility> page =  buildingFacilityService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }
    @RequestMapping("buildFaciAll")
    @ResponseBody
    public String queryBuildFaciAll(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){

            List<BuildingFacility> list = buildingFacilityService.queryAll();
            if(CollectionUtils.isNotEmpty(list)){
                result.setSuccess(true);
                result.setData(list);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 添加配套设施
     * @param buildingFacility
     * @return
     */
    @RequestMapping("add-buildFaci")
    @ResponseBody
    public String addBuildFaci(BuildingFacility buildingFacility){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != buildingFacility && !StringUtils.isBlank(buildingFacility.getFacilName())){
            boolean success = buildingFacilityService.addBuildingFacility(buildingFacility);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("添加失败!");
            }
        }else{
            result.setMessage("配套设施名称不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 删除配套设施
     * @param id
     * @return
     */
    @RequestMapping("delete-buildFaci")
    @ResponseBody
    public String deleteBuildFaci(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            boolean success = buildingFacilityService.deleteById(id);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("操作失败!");
            }
        }
        return gson.toJson(result);
    }
    @RequestMapping("buildFinishPage")
    @ResponseBody
    public String queryBuildFinishPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<BuildingFinishing> page =  buildingFinishingService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("buildFinish-all")
    @ResponseBody
    public String queryAllBuildFinish(){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        List<BuildingFinishing> list =  buildingFinishingService.queryAll();
        result.setSuccess(true);
        result.setData(list);
        return gson.toJson(result);
    }

    /**
     * 添加装修类型
     * @param buildingFinishing
     * @return
     */
    @RequestMapping("add-buildFinish")
    @ResponseBody
    public String addBuildFinish(BuildingFinishing buildingFinishing){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != buildingFinishing){
            boolean success = buildingFinishingService.addBuildingFinishing(buildingFinishing);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("添加失败!");
            }
        }else{
            result.setMessage("类型不可为空!");
        }
        return gson.toJson(result);
    }
    /**
     * 添加装修类型
     * @param id
     * @return
     */
    @RequestMapping("delete-buildFinish")
    @ResponseBody
    public String deleteBuildFinish(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            boolean success = buildingFinishingService.deleteBuildingFinishing(id);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("添加失败!");
            }
        }else{
            result.setMessage("类型id不可为空!");
        }
        return gson.toJson(result);
    }
    @RequestMapping("buildOccupPage")
    @ResponseBody
    public String queryBuildOccupPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<BuildingOccupancy> page =  buildingOccupancyService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("buildOccup-all")
    @ResponseBody
    public String queryAllOccupPage(){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        List<BuildingOccupancy> list =  buildingOccupancyService.queryAll();
        result.setSuccess(true);
        result.setData(list);
        return gson.toJson(result);
    }

    /**
     * 添加适宜业态
     * @param buildingOccupancy
     * @return
     */
    @RequestMapping("add-buildOccup")
    @ResponseBody
    public String addOccup(BuildingOccupancy buildingOccupancy){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != buildingOccupancy && !StringUtils.isBlank(buildingOccupancy.getOcpyName())){
            boolean success = buildingOccupancyService.addOccupancy(buildingOccupancy);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("操作失败!");
            }
        }else{
            result.setMessage("名称不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 删除适宜业态
     * @param id
     * @return
     */
    @RequestMapping("delete-buildOccup")
    @ResponseBody
    public String deleteOccup(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            boolean success = buildingOccupancyService.deleteById(id);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("操作失败!");
            }
        }else{
            result.setMessage("id不可为空!");
        }
        return gson.toJson(result);
    }
    @RequestMapping("districtPage")
    @ResponseBody
    public String queryDistrictPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<District> page =  districtService.queryListByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 查询所有地区
     * @return
     */
    @RequestMapping("district-all")
    @ResponseBody
    public String queryAllDistrict(){
        RequestResult result = new RequestResult();
        result.setSuccess(true);
        List<District> list = districtService.queryAll();
        result.setData(list);
        return gson.toJson(result);
    }

    /**
     * 添加地区
     * @param district
     * @return
     */
    @RequestMapping("add-district")
    @ResponseBody
    public String addDistrict(District district){
        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != district && !StringUtils.isBlank(district.getDistrictName())){
            boolean success = districtService.addDistrict(district);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("添加失败!");
            }
        }else{
            result.setMessage("地区名称不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 上移地区
     * @param id
     * @param ifup
     * @return
     */
    @RequestMapping("update-priority")
    @ResponseBody
    public String updateDistrictPriority(Integer id,boolean ifup){
        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            boolean success = districtService.updatePriority(id,ifup);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("操作失败!");
            }
        }else{
            result.setMessage("id不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 删除地区
     * @param id
     * @return
     */
    @RequestMapping("delete-district")
    @ResponseBody
    public String deleteDistrict(Integer id){
        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            boolean success = districtService.deleteDistrictById(id);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("操作失败!");
            }
        }else{
            result.setMessage("id不可为空!");
        }
        return gson.toJson(result);
    }

    @RequestMapping("hotcatePage")
    @ResponseBody
    public String queryHotcatePage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Hotcategory> page =  hotcategoryService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 查询所有的所属商铺类型
     * @return
     */
    @RequestMapping("hotcate-all")
    @ResponseBody
    public String queryAllHotcate(){

        RequestResult result = new RequestResult();
        result.setSuccess(true);
        List<Hotcategory> list =  hotcategoryService.queryAll();

        result.setData(list);
        return gson.toJson(result);
    }

    /**
     * 添加商铺类型
     * @param hotcategory
     * @return
     */
    @RequestMapping("add-hotcate")
    @ResponseBody
    public String addHotcate(Hotcategory hotcategory){

        RequestResult result = new RequestResult();
        result.setSuccess(false);

        if(null != hotcategory && !StringUtils.isBlank(hotcategory.getHotName())){
            boolean success = hotcategoryService.addHotcate(hotcategory);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("操作失败");
            }
        }
        return gson.toJson(result);
    }

    /**
     * 删除商铺类型
     * @param id
     * @return
     */
    @RequestMapping("delete-hotcate")
    @ResponseBody
    public String deleteHotcate(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);

        if(null != id){
            boolean success = hotcategoryService.deleteById(id);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("操作失败");
            }
        }else{
            result.setMessage("id不可为空!");
        }
        return gson.toJson(result);
    }
    @RequestMapping("shopTypePage")
    @ResponseBody
    public String queryShopTypePage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<ShopType> page =  shopTypeService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("shopType-all")
    @ResponseBody
    public String queryShopTypeAll(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            List<ShopType> list = shopTypeService.queryAll();
            if(CollectionUtils.isNotEmpty(list)){
                result.setData(list);
                result.setSuccess(true);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 添加物业性质
     * @param shopType
     * @return
     */
    @RequestMapping("add-shopType")
    @ResponseBody
    public String addShopType(ShopType shopType){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != shopType && !StringUtils.isBlank(shopType.getTypeName())){
            boolean success = shopTypeService.addShopType(shopType);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("操作失败!");
            }
        }else{
            result.setMessage("名称不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 删除物业性质
     * @param id
     * @return
     */
    @RequestMapping("delete-shopType")
    @ResponseBody
    public String deleteShopType(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            boolean success = shopTypeService.deleteById(id);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("操作失败!");
            }
        }
        return gson.toJson(result);
    }
    @RequestMapping("streetPage")
    @ResponseBody
    public String queryStreetPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<StreetVo> page =  streetService.queryVoByCondtion(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    @RequestMapping("street-list")
    @ResponseBody
    public String queryStreetList(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<StreetVo> page =  streetService.queryVoByCondtion(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page.getPageData());
            }
        }
        return gson.toJson(result);
    }

    /**
     * 获取所有街道
     * @return
     */
    @RequestMapping("street-all")
    @ResponseBody
    public String queryStreetAll(){

        RequestResult result = new RequestResult();
        result.setSuccess(true);
        List<Street> list = streetService.queryAll();
        result.setData(list);
        return gson.toJson(result);
    }

    /**
     * 添加街镇
     * @param street
     * @return
     */
    @RequestMapping("add-stree")
    @ResponseBody
    public String addStreet(Street street){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != street && null != street.getDistrictId() && !StringUtils.isBlank(street.getStreetName())){
            boolean success = streetService.addStreet(street);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("添加失败!");
            }
        }else{
            result.setMessage("街道名称和地区不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 删除街道
     * @param id
     * @return
     */
    @RequestMapping("delete-stree")
    @ResponseBody
    public String deletetreet(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            boolean success = streetService.deleteById(id);
            if(success){
                result.setSuccess(true);
            }else{
                result.setMessage("添加失败!");
            }
        }else{
            result.setMessage("id不可为空!");
        }
        return gson.toJson(result);
    }

    @RequestMapping("friendPage")
    @ResponseBody
    public String queryFriendPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Friend> page =  friendService.queryListByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 上架,下架友情链接
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("update-friend-status")
    @ResponseBody
    public String updateFriendStatus(Integer id,Integer status){
        RequestResult result = new RequestResult();
        result.setSuccess(false);
        result = friendService.updateFriendStatus(id,status);
        return gson.toJson(result);
    }

    /**
     * 添加友情链接
     * @param friend
     * @return
     */
    @RequestMapping("add-friend")
    @ResponseBody
    public String addFriend(Friend friend){
        RequestResult result = new RequestResult();
        result.setSuccess(false);
        result = friendService.addFriend(friend);
        return gson.toJson(result);
    }

    /**
     * 获取合作伙伴列表
     * @param condition
     * @return
     */
    @RequestMapping("partnerPage")
    @ResponseBody
    public String queryPartnerPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Partner> page =  partnerService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 添加合作伙伴
     * @param partner
     * @return
     */
    @RequestMapping("add-partner")
    @ResponseBody
    public String addPartner(Partner partner){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != partner && !StringUtils.isBlank(partner.getFileName())){
            result = partnerService.addPartner(partner);
        }else{
            result.setMessage("合作伙伴图片不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 上架,下架合作伙伴
     * @param id
     * @param ifOnline
     * @return
     */
    @RequestMapping("update-partner-status")
    @ResponseBody
    public String updatePartnerStatus(Integer id,boolean ifOnline){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            if(ifOnline){
                result = partnerService.onlinePartner(id);
            }else{
                result = partnerService.offlinePartner(id);
            }
        }else{
            result.setMessage("id不可为空!");
        }
        return gson.toJson(result);
    }
    /**
     * 获取招商项目列表
     * @param condition
     * @return
     */
    @RequestMapping("businessPage")
    @ResponseBody
    public String queryBusinessPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Business> page =  businessService.queryPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 获取Flash列表
     * @param condition
     * @return
     */
    @RequestMapping("flashPage")
    @ResponseBody
    public String queryFlashPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<Flash> page =  flashService.queryListByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 添加flash
     * @param flash
     * @return
     */
    @RequestMapping("addFlash")
    @ResponseBody
    public String addFlash(Flash flash){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != flash && !StringUtils.isBlank(flash.getFlashName())){
           result = flashService.addFlash(flash);
        }else{
            result.setMessage("请重新上传flash");
        }
        return gson.toJson(result);
    }
    /**
     * 删除flash
     * @param id
     * @return
     */
    @RequestMapping("deleteFlash")
    @ResponseBody
    public String deleteFlash(Integer id){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            result = flashService.deleteFlash(id);
        }else{
            result.setMessage("id不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 上架,下架 flash
     * @param id
     * @param ifOnline
     * @return
     */
    @RequestMapping("update-flash-status")
    @ResponseBody
    public String updateFlashStatus(Integer id,boolean ifOnline){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            if(ifOnline){
                result = flashService.onlineFlash(id);
            }else{
                result = flashService.offlineFlash(id);
            }
        }else{
            result.setMessage("id不可为空!");
        }
        return gson.toJson(result);
    }

    /**
     * 获取留言列表
     * @param condition
     * @return
     */
    @RequestMapping("qaPage")
    @ResponseBody
    public String queryQaPage(SearchCondition condition){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != condition){
            Page<QaVo> page =  qaService.queryQAPageByCondition(condition);
            if(null != page && CollectionUtils.isNotEmpty(page.getPageData())){
                result.setSuccess(true);
                result.setData(page);
            }
        }
        return gson.toJson(result);
    }

    /**
     * 审核留言列表
     * @param id
     * @return
     */
    @RequestMapping("qa-check")
    @ResponseBody
    public String QaCheck(Integer id,boolean ifPass){

        RequestResult result = new RequestResult();
        result.setSuccess(false);
        if(null != id){
            result = qaService.check(id,ifPass);
        }
        return gson.toJson(result);
    }

}
