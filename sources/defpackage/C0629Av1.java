package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Av1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0629Av1 implements InterfaceC6856tq {

    @Nullable
    public C0710Bw1 d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.robot_fragment, viewGroup, false);
        int i = R.id.accountSelectionPart;
        FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.accountSelectionPart);
        if (frameLayout != null) {
            i = R.id.assetsPart;
            FrameLayout frameLayout2 = (FrameLayout) C3476e.h(viewInflate, R.id.assetsPart);
            if (frameLayout2 != null) {
                i = R.id.dividerAccountOptions;
                FrameLayout frameLayout3 = (FrameLayout) C3476e.h(viewInflate, R.id.dividerAccountOptions);
                if (frameLayout3 != null) {
                    i = R.id.dividerInvestmentAccount;
                    FrameLayout frameLayout4 = (FrameLayout) C3476e.h(viewInflate, R.id.dividerInvestmentAccount);
                    if (frameLayout4 != null) {
                        i = R.id.dividerRealAccountActivation;
                        FrameLayout frameLayout5 = (FrameLayout) C3476e.h(viewInflate, R.id.dividerRealAccountActivation);
                        if (frameLayout5 != null) {
                            i = R.id.dividerRiskManagementFooter;
                            FrameLayout frameLayout6 = (FrameLayout) C3476e.h(viewInflate, R.id.dividerRiskManagementFooter);
                            if (frameLayout6 != null) {
                                i = R.id.dividerStrategiesRiskManagement;
                                FrameLayout frameLayout7 = (FrameLayout) C3476e.h(viewInflate, R.id.dividerStrategiesRiskManagement);
                                if (frameLayout7 != null) {
                                    i = R.id.dividerUnderFooter;
                                    FrameLayout frameLayout8 = (FrameLayout) C3476e.h(viewInflate, R.id.dividerUnderFooter);
                                    if (frameLayout8 != null) {
                                        i = R.id.dividerUnderFooterBig;
                                        FrameLayout frameLayout9 = (FrameLayout) C3476e.h(viewInflate, R.id.dividerUnderFooterBig);
                                        if (frameLayout9 != null) {
                                            i = R.id.footerPart;
                                            FrameLayout frameLayout10 = (FrameLayout) C3476e.h(viewInflate, R.id.footerPart);
                                            if (frameLayout10 != null) {
                                                i = R.id.indicatorPart;
                                                FrameLayout frameLayout11 = (FrameLayout) C3476e.h(viewInflate, R.id.indicatorPart);
                                                if (frameLayout11 != null) {
                                                    i = R.id.investmentPart;
                                                    FrameLayout frameLayout12 = (FrameLayout) C3476e.h(viewInflate, R.id.investmentPart);
                                                    if (frameLayout12 != null) {
                                                        i = R.id.main_scroll_view;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) C3476e.h(viewInflate, R.id.main_scroll_view);
                                                        if (nestedScrollView != null) {
                                                            i = R.id.optionsPart;
                                                            FrameLayout frameLayout13 = (FrameLayout) C3476e.h(viewInflate, R.id.optionsPart);
                                                            if (frameLayout13 != null) {
                                                                i = R.id.realAccountActivationPart;
                                                                FrameLayout frameLayout14 = (FrameLayout) C3476e.h(viewInflate, R.id.realAccountActivationPart);
                                                                if (frameLayout14 != null) {
                                                                    i = R.id.riskManagementPart;
                                                                    FrameLayout frameLayout15 = (FrameLayout) C3476e.h(viewInflate, R.id.riskManagementPart);
                                                                    if (frameLayout15 != null) {
                                                                        i = R.id.startBtn;
                                                                        FrameLayout frameLayout16 = (FrameLayout) C3476e.h(viewInflate, R.id.startBtn);
                                                                        if (frameLayout16 != null) {
                                                                            i = R.id.strategiesPart;
                                                                            FrameLayout frameLayout17 = (FrameLayout) C3476e.h(viewInflate, R.id.strategiesPart);
                                                                            if (frameLayout17 != null) {
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                C0710Bw1 c0710Bw1 = new C0710Bw1(constraintLayout, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, frameLayout7, frameLayout8, frameLayout9, frameLayout10, frameLayout11, frameLayout12, nestedScrollView, frameLayout13, frameLayout14, frameLayout15, frameLayout16, frameLayout17);
                                                                                this.d = c0710Bw1;
                                                                                Intrinsics.checkNotNull(c0710Bw1);
                                                                                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                                                                                return constraintLayout;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @NotNull
    public final NestedScrollView r() {
        C0710Bw1 c0710Bw1 = this.d;
        Intrinsics.checkNotNull(c0710Bw1);
        NestedScrollView mainScrollView = c0710Bw1.r;
        Intrinsics.checkNotNullExpressionValue(mainScrollView, "mainScrollView");
        return mainScrollView;
    }
}
