package com.lucasnav.doeorgaosam.modules.faq

import com.lucasnav.doeorgaosam.modules.post.model.RequestError

class QuestionsRepository(
    private val questionsNetworking: QuestionsNetworking
) {
    fun getQuestions(
        onSuccess: (questions: List<Question>) -> Unit,
        onError: (error: RequestError) -> Unit
    ) {
        questionsNetworking.getQuestionsFromApi(
            onSuccess = {
                onSuccess(it)
            },
            onError = {
                onError(it)
            }
        )
    }
}