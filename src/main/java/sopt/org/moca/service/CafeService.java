package sopt.org.moca.service;

import org.springframework.stereotype.Service;
import sopt.org.moca.dto.*;
import sopt.org.moca.model.DefaultRes;

import java.util.List;

@Service
public interface CafeService {
    DefaultRes<List<EvaluatedCafeSimple>>findEvaluatedCafeSimpleList(final int length);
    DefaultRes<EvaluatedCafeInfo>findEvaluatedCafeInfo(final int cafe_id);
    DefaultRes<List<EvaluatedCafeImg>>findEvaluatedCafeImg(final int cafe_id);
    DefaultRes<List<Evaluation>>findEvaluationList(final int cafe_id);
    DefaultRes<Evaluation_detail>findEvaluationDetail(final int cafe_id, final int barista_id);


    //cafe 정보 상세 조회
    DefaultRes<List<CafeImg>>findCafeImgList(final int cafe_id);
    DefaultRes<CafeInfo>findCafeInfo(final int cafe_id);
    DefaultRes<List<CafeSignitureMenu>>findCafeSignitureMenuList(final int cafe_id);



}