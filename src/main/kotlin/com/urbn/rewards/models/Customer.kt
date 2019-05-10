package com.urbn.rewards.models

data class Customer(
        val email: String,
        val rewardPoints: Int,
        val rewardsTier: String,
        val rewardsTierName: String,
        val nextRewardsTier: String,
        val nextRewardsTierName: String,
        val nextRewardsTierProgress: Float
)