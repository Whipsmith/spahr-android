package nz.spahr.feature.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

interface FeatureNavGraph {
    val navigationGraph: NavGraphBuilder.(NavHostController) -> Unit
}