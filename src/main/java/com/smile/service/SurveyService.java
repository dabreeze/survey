package com.smile.service;import com.smile.dto.SurveyRequestDto;import com.smile.dto.SurveyResponseDto;import com.smile.model.Survey;import org.smile.dto.*;import java.util.List;public interface SurveyService {    public SurveyResponseDto createSurvey(SurveyRequestDto requestDto);//    public QuestionResponseDto createQuestion(QuestionRequestDto requestDto);    public Survey findById(Long id);    public List<Survey> findAllSurvey();    public void deleteSurvey(Survey survey);    public Survey takeSurvey(String batchNumber, String[] response);//    public SurveyPollResponseDto respondToQuestion(ResponseRequestDto response);}