package com.base.feature.robot.robot.investment.screens;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import defpackage.AH1;
import defpackage.AbstractC7721xy;
import defpackage.C0635Ax1;
import defpackage.C0713Bx1;
import defpackage.C0791Cx1;
import defpackage.C0869Dx1;
import defpackage.C1025Fx1;
import defpackage.C1103Gx1;
import defpackage.C1259Ix1;
import defpackage.C1591Ne1;
import defpackage.C1699On1;
import defpackage.C1795Pt1;
import defpackage.C1804Pw1;
import defpackage.C2017Sp1;
import defpackage.C2038Sw1;
import defpackage.C2151Ui0;
import defpackage.C2505Ym0;
import defpackage.C2533Yv1;
import defpackage.C2611Zv1;
import defpackage.C2784ak0;
import defpackage.C2838aw1;
import defpackage.C3286d41;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C4987kx1;
import defpackage.C5189lv;
import defpackage.C5561ng0;
import defpackage.C5620nx1;
import defpackage.C5653o60;
import defpackage.C5830ox1;
import defpackage.C5835oz0;
import defpackage.C5885pC0;
import defpackage.C6040px1;
import defpackage.C6250qx1;
import defpackage.C6399rg;
import defpackage.C6459rx1;
import defpackage.C6590sb0;
import defpackage.C6669sx1;
import defpackage.C6851to0;
import defpackage.C6879tx1;
import defpackage.C7061uo0;
import defpackage.C7089ux1;
import defpackage.C7299vx1;
import defpackage.C7510wx1;
import defpackage.C7606xQ;
import defpackage.C7644xc;
import defpackage.C7652xe;
import defpackage.C7720xx1;
import defpackage.C7930yx1;
import defpackage.C8137zw1;
import defpackage.C8140zx1;
import defpackage.E42;
import defpackage.EnumC4403iP0;
import defpackage.EnumC7035uh1;
import defpackage.FP0;
import defpackage.FP1;
import defpackage.G32;
import defpackage.GP1;
import defpackage.IW;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC2124Tz0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.J32;
import defpackage.JM;
import defpackage.JX;
import defpackage.K32;
import defpackage.K42;
import defpackage.MN;
import defpackage.MT0;
import defpackage.OQ;
import defpackage.Od2;
import defpackage.PQ;
import defpackage.Q2;
import defpackage.R40;
import defpackage.SZ1;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC0792Cy;
import defpackage.ViewOnClickListenerC3257cw1;
import defpackage.ViewOnClickListenerC6733tF0;
import defpackage.WE;
import defpackage.XO0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/investment/screens/RobotInvestmentPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LIx1;", "LYv1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotInvestmentPart extends SimpleFragmentInflate<C1259Ix1, C2533Yv1> {
    public static final long u;
    public static final /* synthetic */ int v = 0;

    @NotNull
    public final C2038Sw1 l;

    @NotNull
    public final Sd2 m;

    @NotNull
    public final InterfaceC2124Tz0 n;

    @NotNull
    public final MT0 o;

    @NotNull
    public final C7061uo0 p;

    @Nullable
    public ObjectAnimator q;

    @Nullable
    public OQ r;
    public G32 s;

    @NotNull
    public final a t;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2533Yv1> {
        public static final a m = new a(3, C2533Yv1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotCurrentInvestmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C2533Yv1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_current_investment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.chart_placeholder;
            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.chart_placeholder);
            if (imageView != null) {
                i = R.id.chart_placeholder_shimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C3476e.h(viewInflate, R.id.chart_placeholder_shimmer);
                if (shimmerFrameLayout != null) {
                    i = R.id.current_investment_card_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C3476e.h(viewInflate, R.id.current_investment_card_container);
                    if (constraintLayout != null) {
                        i = R.id.indicators_barrier;
                        if (((Barrier) C3476e.h(viewInflate, R.id.indicators_barrier)) != null) {
                            i = R.id.investment_account_barrier;
                            if (((Barrier) C3476e.h(viewInflate, R.id.investment_account_barrier)) != null) {
                                i = R.id.investment_account_type;
                                TextView textView = (TextView) C3476e.h(viewInflate, R.id.investment_account_type);
                                if (textView != null) {
                                    i = R.id.investment_asset_icon;
                                    ImageView imageView2 = (ImageView) C3476e.h(viewInflate, R.id.investment_asset_icon);
                                    if (imageView2 != null) {
                                        i = R.id.investment_asset_icon_placeholder;
                                        ImageView imageView3 = (ImageView) C3476e.h(viewInflate, R.id.investment_asset_icon_placeholder);
                                        if (imageView3 != null) {
                                            i = R.id.investment_asset_icon_placeholder_shimmer;
                                            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C3476e.h(viewInflate, R.id.investment_asset_icon_placeholder_shimmer);
                                            if (shimmerFrameLayout2 != null) {
                                                i = R.id.investment_asset_name;
                                                TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.investment_asset_name);
                                                if (textView2 != null) {
                                                    i = R.id.investment_asset_percents;
                                                    TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.investment_asset_percents);
                                                    if (textView3 != null) {
                                                        i = R.id.investment_balance;
                                                        TextView textView4 = (TextView) C3476e.h(viewInflate, R.id.investment_balance);
                                                        if (textView4 != null) {
                                                            i = R.id.investment_mock_view_to_add_chart;
                                                            if (C3476e.h(viewInflate, R.id.investment_mock_view_to_add_chart) != null) {
                                                                i = R.id.investment_separator;
                                                                if (C3476e.h(viewInflate, R.id.investment_separator) != null) {
                                                                    i = R.id.investment_title;
                                                                    if (((TextView) C3476e.h(viewInflate, R.id.investment_title)) != null) {
                                                                        i = R.id.materialCardView;
                                                                        MaterialCardView materialCardView = (MaterialCardView) C3476e.h(viewInflate, R.id.materialCardView);
                                                                        if (materialCardView != null) {
                                                                            i = R.id.progress_layout;
                                                                            View viewH = C3476e.h(viewInflate, R.id.progress_layout);
                                                                            if (viewH != null) {
                                                                                int i2 = R.id.background;
                                                                                if (((ImageView) C3476e.h(viewH, R.id.background)) != null) {
                                                                                    i2 = R.id.progress_circular;
                                                                                    ProgressBar progressBar = (ProgressBar) C3476e.h(viewH, R.id.progress_circular);
                                                                                    if (progressBar != null) {
                                                                                        C6851to0 c6851to0 = new C6851to0((ConstraintLayout) viewH, progressBar);
                                                                                        int i3 = R.id.progress_layout_signals;
                                                                                        ImageView imageView4 = (ImageView) C3476e.h(viewInflate, R.id.progress_layout_signals);
                                                                                        if (imageView4 != null) {
                                                                                            i3 = R.id.robot_current_investment_ai_indicator;
                                                                                            View viewH2 = C3476e.h(viewInflate, R.id.robot_current_investment_ai_indicator);
                                                                                            if (viewH2 != null) {
                                                                                                int i4 = R.id.ai_indicator_arrow_image;
                                                                                                if (((ImageView) C3476e.h(viewH2, R.id.ai_indicator_arrow_image)) != null) {
                                                                                                    i4 = R.id.ai_indicator_current_investment_description;
                                                                                                    if (((TextView) C3476e.h(viewH2, R.id.ai_indicator_current_investment_description)) != null) {
                                                                                                        ImageView imageView5 = (ImageView) C3476e.h(viewH2, R.id.ai_indicator_icon_image);
                                                                                                        if (imageView5 == null) {
                                                                                                            i4 = R.id.ai_indicator_icon_image;
                                                                                                        } else if (((TextView) C3476e.h(viewH2, R.id.ai_indicator_title)) != null) {
                                                                                                            C8137zw1 c8137zw1 = new C8137zw1((ConstraintLayout) viewH2, imageView5);
                                                                                                            i3 = R.id.robot_current_investment_amount_item;
                                                                                                            View viewH3 = C3476e.h(viewInflate, R.id.robot_current_investment_amount_item);
                                                                                                            if (viewH3 != null) {
                                                                                                                C2838aw1 c2838aw1B = C2838aw1.b(viewH3);
                                                                                                                i3 = R.id.robot_current_investment_item_container;
                                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C3476e.h(viewInflate, R.id.robot_current_investment_item_container);
                                                                                                                if (constraintLayout2 != null) {
                                                                                                                    i3 = R.id.robot_current_investment_linear_amount_item;
                                                                                                                    View viewH4 = C3476e.h(viewInflate, R.id.robot_current_investment_linear_amount_item);
                                                                                                                    if (viewH4 != null) {
                                                                                                                        C2611Zv1 c2611Zv1B = C2611Zv1.b(viewH4);
                                                                                                                        i3 = R.id.robot_current_investment_linear_item_container;
                                                                                                                        LinearLayout linearLayout = (LinearLayout) C3476e.h(viewInflate, R.id.robot_current_investment_linear_item_container);
                                                                                                                        if (linearLayout != null) {
                                                                                                                            i3 = R.id.robot_current_investment_linear_loss_item;
                                                                                                                            View viewH5 = C3476e.h(viewInflate, R.id.robot_current_investment_linear_loss_item);
                                                                                                                            if (viewH5 != null) {
                                                                                                                                C2611Zv1 c2611Zv1B2 = C2611Zv1.b(viewH5);
                                                                                                                                i3 = R.id.robot_current_investment_linear_loss_item_separator;
                                                                                                                                View viewH6 = C3476e.h(viewInflate, R.id.robot_current_investment_linear_loss_item_separator);
                                                                                                                                if (viewH6 != null) {
                                                                                                                                    i3 = R.id.robot_current_investment_linear_profit_item;
                                                                                                                                    View viewH7 = C3476e.h(viewInflate, R.id.robot_current_investment_linear_profit_item);
                                                                                                                                    if (viewH7 != null) {
                                                                                                                                        C2611Zv1 c2611Zv1B3 = C2611Zv1.b(viewH7);
                                                                                                                                        i3 = R.id.robot_current_investment_linear_profit_item_separator;
                                                                                                                                        View viewH8 = C3476e.h(viewInflate, R.id.robot_current_investment_linear_profit_item_separator);
                                                                                                                                        if (viewH8 != null) {
                                                                                                                                            i3 = R.id.robot_current_investment_linear_strategy_item;
                                                                                                                                            View viewH9 = C3476e.h(viewInflate, R.id.robot_current_investment_linear_strategy_item);
                                                                                                                                            if (viewH9 != null) {
                                                                                                                                                C2611Zv1 c2611Zv1B4 = C2611Zv1.b(viewH9);
                                                                                                                                                i3 = R.id.robot_current_investment_linear_strategy_item_separator;
                                                                                                                                                View viewH10 = C3476e.h(viewInflate, R.id.robot_current_investment_linear_strategy_item_separator);
                                                                                                                                                if (viewH10 != null) {
                                                                                                                                                    i3 = R.id.robot_current_investment_loss_limit;
                                                                                                                                                    View viewH11 = C3476e.h(viewInflate, R.id.robot_current_investment_loss_limit);
                                                                                                                                                    if (viewH11 != null) {
                                                                                                                                                        C2838aw1 c2838aw1B2 = C2838aw1.b(viewH11);
                                                                                                                                                        i3 = R.id.robot_current_investment_profit_item;
                                                                                                                                                        View viewH12 = C3476e.h(viewInflate, R.id.robot_current_investment_profit_item);
                                                                                                                                                        if (viewH12 != null) {
                                                                                                                                                            C2838aw1 c2838aw1B3 = C2838aw1.b(viewH12);
                                                                                                                                                            i3 = R.id.robot_current_investment_strategy_top_right_placed_item;
                                                                                                                                                            View viewH13 = C3476e.h(viewInflate, R.id.robot_current_investment_strategy_top_right_placed_item);
                                                                                                                                                            if (viewH13 != null) {
                                                                                                                                                                C2838aw1 c2838aw1B4 = C2838aw1.b(viewH13);
                                                                                                                                                                i3 = R.id.robot_current_investment_trading_loading_indicator;
                                                                                                                                                                ImageView imageView6 = (ImageView) C3476e.h(viewInflate, R.id.robot_current_investment_trading_loading_indicator);
                                                                                                                                                                if (imageView6 != null) {
                                                                                                                                                                    i3 = R.id.robot_current_investment_trading_loading_indicator_shimmer;
                                                                                                                                                                    ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) C3476e.h(viewInflate, R.id.robot_current_investment_trading_loading_indicator_shimmer);
                                                                                                                                                                    if (shimmerFrameLayout3 != null) {
                                                                                                                                                                        i3 = R.id.searching_by_signals_text;
                                                                                                                                                                        TextView textView5 = (TextView) C3476e.h(viewInflate, R.id.searching_by_signals_text);
                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                            i3 = R.id.show_on_chart;
                                                                                                                                                                            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.show_on_chart);
                                                                                                                                                                            if (materialButton != null) {
                                                                                                                                                                                i3 = R.id.signals_icon_in_progress;
                                                                                                                                                                                ImageView imageView7 = (ImageView) C3476e.h(viewInflate, R.id.signals_icon_in_progress);
                                                                                                                                                                                if (imageView7 != null) {
                                                                                                                                                                                    i3 = R.id.stop_the_robot;
                                                                                                                                                                                    MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.stop_the_robot);
                                                                                                                                                                                    if (materialButton2 != null) {
                                                                                                                                                                                        i3 = R.id.timer;
                                                                                                                                                                                        TextView textView6 = (TextView) C3476e.h(viewInflate, R.id.timer);
                                                                                                                                                                                        if (textView6 != null) {
                                                                                                                                                                                            i3 = R.id.trade_change_text;
                                                                                                                                                                                            TextView textView7 = (TextView) C3476e.h(viewInflate, R.id.trade_change_text);
                                                                                                                                                                                            if (textView7 != null) {
                                                                                                                                                                                                i3 = R.id.trade_change_title;
                                                                                                                                                                                                if (((TextView) C3476e.h(viewInflate, R.id.trade_change_title)) != null) {
                                                                                                                                                                                                    i3 = R.id.trading_indicator_text;
                                                                                                                                                                                                    TextView textView8 = (TextView) C3476e.h(viewInflate, R.id.trading_indicator_text);
                                                                                                                                                                                                    if (textView8 != null) {
                                                                                                                                                                                                        return new C2533Yv1((ConstraintLayout) viewInflate, imageView, shimmerFrameLayout, constraintLayout, textView, imageView2, imageView3, shimmerFrameLayout2, textView2, textView3, textView4, materialCardView, c6851to0, imageView4, c8137zw1, c2838aw1B, constraintLayout2, c2611Zv1B, linearLayout, c2611Zv1B2, viewH6, c2611Zv1B3, viewH8, c2611Zv1B4, viewH10, c2838aw1B2, c2838aw1B3, c2838aw1B4, imageView6, shimmerFrameLayout3, textView5, materialButton, imageView7, materialButton2, textView6, textView7, textView8);
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
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i4 = R.id.ai_indicator_title;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewH2.getResources().getResourceName(i4)));
                                                                                            }
                                                                                        }
                                                                                        i = i3;
                                                                                    }
                                                                                }
                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewH.getResources().getResourceName(i2)));
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
    }

    static {
        b.a aVar = b.e;
        u = c.g(100, R40.MILLISECONDS);
    }

    public RobotInvestmentPart(@NotNull C2038Sw1 inAppTutorialViews, @NotNull Sd2 viewModelFactory, @NotNull InterfaceC2124Tz0 initLineChartUseCase, @NotNull MT0 lossLimitRemovedLocalExperiment, @NotNull C7061uo0 hideChartLocalExperiment) {
        Intrinsics.checkNotNullParameter(inAppTutorialViews, "inAppTutorialViews");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(initLineChartUseCase, "initLineChartUseCase");
        Intrinsics.checkNotNullParameter(lossLimitRemovedLocalExperiment, "lossLimitRemovedLocalExperiment");
        Intrinsics.checkNotNullParameter(hideChartLocalExperiment, "hideChartLocalExperiment");
        this.l = inAppTutorialViews;
        this.m = viewModelFactory;
        this.n = initLineChartUseCase;
        this.o = lossLimitRemovedLocalExperiment;
        this.p = hideChartLocalExperiment;
        this.t = a.m;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:123:0x022c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0237  */
    /* JADX WARN: Code duplicated, block: B:130:0x023d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0241  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0105  */
    /* JADX WARN: Code duplicated, block: B:48:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x013a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0150  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x0166  */
    /* JADX WARN: Code duplicated, block: B:89:0x017b  */
    /* JADX WARN: Code duplicated, block: B:95:0x018e  */
    public static final Object l(RobotInvestmentPart robotInvestmentPart, PQ pq, JM jm) {
        C1025Fx1 c1025Fx1;
        C2533Yv1 c2533Yv1;
        ShimmerFrameLayout shimmerFrameLayout;
        boolean z;
        boolean zO;
        ShimmerFrameLayout shimmerFrameLayout2;
        int i;
        boolean z2;
        boolean z3;
        OQ oq;
        PQ pq2;
        boolean z4;
        boolean z5;
        PQ pq3;
        boolean z6;
        boolean z7;
        boolean z8;
        int i2;
        boolean z9;
        boolean z10;
        ImageView animateInfiniteRotation;
        boolean z11;
        ObjectAnimator objectAnimator;
        ShimmerFrameLayout shimmerFrameLayout3;
        boolean z12;
        robotInvestmentPart.getClass();
        if (jm instanceof C1025Fx1) {
            c1025Fx1 = (C1025Fx1) jm;
            int i3 = c1025Fx1.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1025Fx1.j = i3 - Integer.MIN_VALUE;
            } else {
                c1025Fx1 = new C1025Fx1(robotInvestmentPart, jm);
            }
        } else {
            c1025Fx1 = new C1025Fx1(robotInvestmentPart, jm);
        }
        Object obj = c1025Fx1.h;
        MN mn = MN.d;
        int i4 = c1025Fx1.j;
        if (i4 == 0) {
            C1795Pt1.b(obj);
            c2533Yv1 = (C2533Yv1) robotInvestmentPart.k();
            C2533Yv1 c2533Yv2 = (C2533Yv1) robotInvestmentPart.k();
            ArrayList<ViewGroup> arrayList = K42.c;
            ConstraintLayout constraintLayout = c2533Yv2.h;
            arrayList.remove(constraintLayout);
            ArrayList<E42> orDefault = K42.b().getOrDefault(constraintLayout, null);
            if (orDefault != null && !orDefault.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(orDefault);
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    ((E42) arrayList2.get(size)).p(constraintLayout);
                }
            }
            if (pq == PQ.NOT_VISIBLE) {
                robotInvestmentPart.n();
            } else if (pq.d && pq.e) {
                Resources resources = robotInvestmentPart.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                long jG = C7644xc.g(resources);
                c1025Fx1.d = robotInvestmentPart;
                c1025Fx1.e = pq;
                c1025Fx1.g = c2533Yv1;
                c1025Fx1.j = 1;
                if (IW.c(jG, c1025Fx1) == mn) {
                    return mn;
                }
            }
            C6590sb0 setDuration = new C6590sb0();
            Resources resources2 = robotInvestmentPart.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            long jG2 = C7644xc.g(resources2);
            Intrinsics.checkNotNullParameter(setDuration, "$this$setDuration");
            setDuration.g = b.l(jG2);
            Intrinsics.checkNotNullExpressionValue(setDuration, "setDuration(...)");
            K42.a(((C2533Yv1) robotInvestmentPart.k()).h, setDuration);
            shimmerFrameLayout = c2533Yv1.H;
            if (pq == PQ.LOADING) {
                z = true;
            } else {
                z = false;
            }
            Intrinsics.checkNotNull(shimmerFrameLayout);
            o(shimmerFrameLayout, z);
            if (z) {
                shimmerFrameLayout.b();
            } else {
                shimmerFrameLayout.c();
            }
            zO = robotInvestmentPart.p.o();
            shimmerFrameLayout2 = c2533Yv1.g;
            i = 8;
            if (zO) {
                Intrinsics.checkNotNull(shimmerFrameLayout2);
                shimmerFrameLayout2.setVisibility(8);
            } else {
                if (pq != PQ.TRADING || pq == PQ.NOT_VISIBLE) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z3 = pq.e;
                if (z3) {
                    if (z2) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                }
                shimmerFrameLayout2.setVisibility(i);
                Intrinsics.checkNotNull(shimmerFrameLayout2);
                if (z2 || !z3) {
                    shimmerFrameLayout2.c();
                } else {
                    shimmerFrameLayout2.b();
                }
            }
            oq = robotInvestmentPart.r;
            if (oq != null) {
                if (pq != PQ.TRADING || pq == PQ.NOT_VISIBLE) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o(oq, z12);
            }
            TextView timer = c2533Yv1.M;
            Intrinsics.checkNotNullExpressionValue(timer, "timer");
            pq2 = PQ.TRADING;
            if (pq != pq2 || pq == PQ.TRADING_WITHOUT_CHART) {
                z4 = true;
            } else {
                z4 = false;
            }
            o(timer, z4);
            ConstraintLayout constraintLayout2 = c2533Yv1.q.d;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            if (pq != pq2 || pq == PQ.TRADING_WITHOUT_CHART) {
                z5 = true;
            } else {
                z5 = false;
            }
            o(constraintLayout2, z5);
            TextView investmentAssetName = c2533Yv1.m;
            Intrinsics.checkNotNullExpressionValue(investmentAssetName, "investmentAssetName");
            pq3 = PQ.SEARCHING_FOR_SIGNALS;
            if (pq != pq3 || pq == PQ.NOT_VISIBLE) {
                z6 = false;
            } else {
                z6 = true;
            }
            o(investmentAssetName, z6);
            TextView investmentAssetPercents = c2533Yv1.n;
            Intrinsics.checkNotNullExpressionValue(investmentAssetPercents, "investmentAssetPercents");
            if (pq != pq3 || pq == PQ.NOT_VISIBLE) {
                z7 = false;
            } else {
                z7 = true;
            }
            o(investmentAssetPercents, z7);
            ImageView investmentAssetIcon = c2533Yv1.j;
            Intrinsics.checkNotNullExpressionValue(investmentAssetIcon, "investmentAssetIcon");
            if (pq != pq3 || pq == PQ.NOT_VISIBLE) {
                z8 = false;
            } else {
                z8 = true;
            }
            o(investmentAssetIcon, z8);
            if (pq.e) {
                i2 = R.string.show_on_chart_text;
            } else {
                i2 = R.string.btn_show_chart_text;
            }
            c2533Yv1.J.setText(robotInvestmentPart.getString(i2));
            ImageView signalsIconInProgress = c2533Yv1.K;
            Intrinsics.checkNotNullExpressionValue(signalsIconInProgress, "signalsIconInProgress");
            if (pq == pq3) {
                z9 = true;
            } else {
                z9 = false;
            }
            o(signalsIconInProgress, z9);
            TextView searchingBySignalsText = c2533Yv1.I;
            Intrinsics.checkNotNullExpressionValue(searchingBySignalsText, "searchingBySignalsText");
            if (pq == pq3) {
                z10 = true;
            } else {
                z10 = false;
            }
            o(searchingBySignalsText, z10);
            animateInfiniteRotation = c2533Yv1.r;
            Intrinsics.checkNotNullExpressionValue(animateInfiniteRotation, "progressLayoutSignals");
            if (pq == pq3) {
                z11 = true;
            } else {
                z11 = false;
            }
            o(animateInfiniteRotation, z11);
            if (pq == pq3) {
                Intrinsics.checkNotNullExpressionValue(animateInfiniteRotation, "progressLayoutSignals");
                Resources resources3 = animateInfiniteRotation.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                long jG3 = C7644xc.g(resources3);
                Intrinsics.checkNotNullParameter(animateInfiniteRotation, "$this$animateInfiniteRotation");
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(animateInfiniteRotation, "rotation", 0.0f, 360.0f);
                objectAnimatorOfFloat.setRepeatMode(1);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.start();
                Intrinsics.checkNotNull(objectAnimatorOfFloat);
                robotInvestmentPart.q = objectAnimatorOfFloat;
            } else {
                objectAnimator = robotInvestmentPart.q;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
            }
            shimmerFrameLayout3 = c2533Yv1.l;
            Intrinsics.checkNotNull(shimmerFrameLayout3);
            o(shimmerFrameLayout3, pq == pq3);
            if (pq == pq3) {
                shimmerFrameLayout3.b();
            } else {
                shimmerFrameLayout3.c();
            }
            return Unit.a;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C2533Yv1 c2533Yv3 = c1025Fx1.g;
        pq = c1025Fx1.e;
        RobotInvestmentPart robotInvestmentPart2 = c1025Fx1.d;
        C1795Pt1.b(obj);
        c2533Yv1 = c2533Yv3;
        robotInvestmentPart = robotInvestmentPart2;
        robotInvestmentPart.r = robotInvestmentPart.m();
        C6590sb0 setDuration2 = new C6590sb0();
        Resources resources4 = robotInvestmentPart.getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        long jG4 = C7644xc.g(resources4);
        Intrinsics.checkNotNullParameter(setDuration2, "$this$setDuration");
        setDuration2.g = b.l(jG4);
        Intrinsics.checkNotNullExpressionValue(setDuration2, "setDuration(...)");
        K42.a(((C2533Yv1) robotInvestmentPart.k()).h, setDuration2);
        shimmerFrameLayout = c2533Yv1.H;
        if (pq == PQ.LOADING) {
            z = true;
        } else {
            z = false;
        }
        Intrinsics.checkNotNull(shimmerFrameLayout);
        o(shimmerFrameLayout, z);
        if (z) {
            shimmerFrameLayout.b();
        } else {
            shimmerFrameLayout.c();
        }
        zO = robotInvestmentPart.p.o();
        shimmerFrameLayout2 = c2533Yv1.g;
        i = 8;
        if (zO) {
            Intrinsics.checkNotNull(shimmerFrameLayout2);
            shimmerFrameLayout2.setVisibility(8);
        } else {
            if (pq != PQ.TRADING) {
                z2 = false;
            } else {
                z2 = false;
            }
            z3 = pq.e;
            if (z3) {
                if (z2) {
                    i = 0;
                } else {
                    i = 4;
                }
            }
            shimmerFrameLayout2.setVisibility(i);
            Intrinsics.checkNotNull(shimmerFrameLayout2);
            if (z2) {
                shimmerFrameLayout2.c();
            } else {
                shimmerFrameLayout2.c();
            }
        }
        oq = robotInvestmentPart.r;
        if (oq != null) {
            if (pq != PQ.TRADING) {
                z12 = true;
            } else {
                z12 = true;
            }
            o(oq, z12);
        }
        TextView timer2 = c2533Yv1.M;
        Intrinsics.checkNotNullExpressionValue(timer2, "timer");
        pq2 = PQ.TRADING;
        if (pq != pq2) {
            z4 = true;
        } else {
            z4 = true;
        }
        o(timer2, z4);
        ConstraintLayout constraintLayout3 = c2533Yv1.q.d;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
        if (pq != pq2) {
            z5 = true;
        } else {
            z5 = true;
        }
        o(constraintLayout3, z5);
        TextView investmentAssetName2 = c2533Yv1.m;
        Intrinsics.checkNotNullExpressionValue(investmentAssetName2, "investmentAssetName");
        pq3 = PQ.SEARCHING_FOR_SIGNALS;
        if (pq != pq3) {
            z6 = false;
        } else {
            z6 = false;
        }
        o(investmentAssetName2, z6);
        TextView investmentAssetPercents2 = c2533Yv1.n;
        Intrinsics.checkNotNullExpressionValue(investmentAssetPercents2, "investmentAssetPercents");
        if (pq != pq3) {
            z7 = false;
        } else {
            z7 = false;
        }
        o(investmentAssetPercents2, z7);
        ImageView investmentAssetIcon2 = c2533Yv1.j;
        Intrinsics.checkNotNullExpressionValue(investmentAssetIcon2, "investmentAssetIcon");
        if (pq != pq3) {
            z8 = false;
        } else {
            z8 = false;
        }
        o(investmentAssetIcon2, z8);
        if (pq.e) {
            i2 = R.string.show_on_chart_text;
        } else {
            i2 = R.string.btn_show_chart_text;
        }
        c2533Yv1.J.setText(robotInvestmentPart.getString(i2));
        ImageView signalsIconInProgress2 = c2533Yv1.K;
        Intrinsics.checkNotNullExpressionValue(signalsIconInProgress2, "signalsIconInProgress");
        if (pq == pq3) {
            z9 = true;
        } else {
            z9 = false;
        }
        o(signalsIconInProgress2, z9);
        TextView searchingBySignalsText2 = c2533Yv1.I;
        Intrinsics.checkNotNullExpressionValue(searchingBySignalsText2, "searchingBySignalsText");
        if (pq == pq3) {
            z10 = true;
        } else {
            z10 = false;
        }
        o(searchingBySignalsText2, z10);
        animateInfiniteRotation = c2533Yv1.r;
        Intrinsics.checkNotNullExpressionValue(animateInfiniteRotation, "progressLayoutSignals");
        if (pq == pq3) {
            z11 = true;
        } else {
            z11 = false;
        }
        o(animateInfiniteRotation, z11);
        if (pq == pq3) {
            Intrinsics.checkNotNullExpressionValue(animateInfiniteRotation, "progressLayoutSignals");
            Resources resources5 = animateInfiniteRotation.getResources();
            Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
            long jG5 = C7644xc.g(resources5);
            Intrinsics.checkNotNullParameter(animateInfiniteRotation, "$this$animateInfiniteRotation");
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(animateInfiniteRotation, "rotation", 0.0f, 360.0f);
            objectAnimatorOfFloat2.setRepeatMode(1);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat2.start();
            Intrinsics.checkNotNull(objectAnimatorOfFloat2);
            robotInvestmentPart.q = objectAnimatorOfFloat2;
        } else {
            objectAnimator = robotInvestmentPart.q;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
        }
        shimmerFrameLayout3 = c2533Yv1.l;
        Intrinsics.checkNotNull(shimmerFrameLayout3);
        o(shimmerFrameLayout3, pq == pq3);
        if (pq == pq3) {
            shimmerFrameLayout3.b();
        } else {
            shimmerFrameLayout3.c();
        }
        return Unit.a;
    }

    public static void o(View view, boolean z) {
        view.setVisibility(z ? 0 : 4);
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        G32 c5835oz0 = this.o.o() ? new C5835oz0((C2533Yv1) k()) : new C2505Ym0((C2533Yv1) k());
        this.s = c5835oz0;
        c5835oz0.b().c().setText(R.string.main_robot_amount_title);
        G32 g32 = this.s;
        if (g32 == null) {
            Intrinsics.l("tradingOptions");
            throw null;
        }
        g32.d().c().setText(R.string.bot_settings_limit_loss_title);
        G32 g33 = this.s;
        if (g33 == null) {
            Intrinsics.l("tradingOptions");
            throw null;
        }
        g33.c().c().setText(R.string.trading_options_profitlimit_tittle_text);
        G32 g34 = this.s;
        if (g34 == null) {
            Intrinsics.l("tradingOptions");
            throw null;
        }
        g34.e().c().setText(R.string.strategy_text);
        G32 g35 = this.s;
        if (g35 == null) {
            Intrinsics.l("tradingOptions");
            throw null;
        }
        g35.a();
        C2533Yv1 c2533Yv1 = (C2533Yv1) k();
        ImageView signalsIconInProgress = c2533Yv1.K;
        Intrinsics.checkNotNullExpressionValue(signalsIconInProgress, "signalsIconInProgress");
        EnumC7035uh1 enumC7035uh1 = EnumC7035uh1.g;
        C3435dm0.e(signalsIconInProgress, R.drawable.ic_signals_in_progress, enumC7035uh1);
        ImageView progressLayoutSignals = c2533Yv1.r;
        Intrinsics.checkNotNullExpressionValue(progressLayoutSignals, "progressLayoutSignals");
        C3435dm0.e(progressLayoutSignals, R.drawable.ic_loading_signals, enumC7035uh1);
        ImageView chartPlaceholder = c2533Yv1.e;
        Intrinsics.checkNotNullExpressionValue(chartPlaceholder, "chartPlaceholder");
        C3435dm0.d(chartPlaceholder, R.drawable.ic_current_investment_chart);
        ImageView aiIndicatorIconImage = c2533Yv1.s.e;
        Intrinsics.checkNotNullExpressionValue(aiIndicatorIconImage, "aiIndicatorIconImage");
        C3435dm0.f(aiIndicatorIconImage, "https://assets.pbotservices.com/images/indicators/ai_circle.png");
        ImageView investmentAssetIconPlaceholder = c2533Yv1.k;
        Intrinsics.checkNotNullExpressionValue(investmentAssetIconPlaceholder, "investmentAssetIconPlaceholder");
        C3435dm0.d(investmentAssetIconPlaceholder, R.drawable.ic_trading_asset_not_loaded_icon_for_shimmer);
        ImageView robotCurrentInvestmentTradingLoadingIndicator = c2533Yv1.G;
        Intrinsics.checkNotNullExpressionValue(robotCurrentInvestmentTradingLoadingIndicator, "robotCurrentInvestmentTradingLoadingIndicator");
        C3435dm0.d(robotCurrentInvestmentTradingLoadingIndicator, R.drawable.ic_timer_shimmer);
        GP1 gp1 = this.l.d;
        MaterialCardView materialCardView = c2533Yv1.p;
        gp1.getClass();
        gp1.m(null, materialCardView);
        G32 g36 = this.s;
        if (g36 == null) {
            Intrinsics.l("tradingOptions");
            throw null;
        }
        C3435dm0.e(g36.e().a(), R.drawable.ic_strategy, EnumC7035uh1.g);
        C2533Yv1 c2533Yv2 = (C2533Yv1) k();
        c2533Yv2.J.setOnClickListener(new ViewOnClickListenerC6733tF0(this, 3));
        c2533Yv2.L.setOnClickListener(new ViewOnClickListenerC0792Cy(this, 1));
        ((C2533Yv1) k()).s.d.setOnClickListener(new ViewOnClickListenerC3257cw1(this, 1));
        C2533Yv1 c2533Yv3 = (C2533Yv1) k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1699On1 c1699On1 = ((C1259Ix1) obj).u;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C6250qx1(viewLifecycleOwner, c1699On1, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        InterfaceC6396rf0<Boolean> interfaceC6396rf0 = ((C1259Ix1) obj2).w;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C6459rx1(viewLifecycleOwner2, interfaceC6396rf0, null, this), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C5561ng0 c5561ng0 = ((C1259Ix1) obj3).x;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C6879tx1(viewLifecycleOwner3, c5561ng0, null, c2533Yv3), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        FP1<K32> fp1 = ((C1259Ix1) obj4).y;
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new C7510wx1(viewLifecycleOwner4, fp1, null, c2533Yv3), 3);
        Object obj5 = this.i;
        Intrinsics.checkNotNull(obj5);
        C5561ng0 c5561ng1 = ((C1259Ix1) obj5).B;
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new C7720xx1(viewLifecycleOwner5, c5561ng1, null, c2533Yv3, this), 3);
        Object obj6 = this.i;
        Intrinsics.checkNotNull(obj6);
        C5561ng0 c5561ng2 = ((C1259Ix1) obj6).D;
        FP0 viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner6), null, new C6669sx1(viewLifecycleOwner6, c5561ng2, null, this), 3);
        Object obj7 = this.i;
        Intrinsics.checkNotNull(obj7);
        C5561ng0 c5561ng3 = ((C1259Ix1) obj7).z;
        FP0 viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner7), null, new C7930yx1(viewLifecycleOwner7, c5561ng3, null, c2533Yv3), 3);
        Object obj8 = this.i;
        Intrinsics.checkNotNull(obj8);
        C5561ng0 c5561ng4 = ((C1259Ix1) obj8).A;
        FP0 viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner8), null, new C8140zx1(viewLifecycleOwner8, c5561ng4, null, this), 3);
        Object obj9 = this.i;
        Intrinsics.checkNotNull(obj9);
        C1699On1 c1699On2 = ((C1259Ix1) obj9).C;
        FP0 viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner9), null, new C0635Ax1(viewLifecycleOwner9, c1699On2, null, this), 3);
        Object obj10 = this.i;
        Intrinsics.checkNotNull(obj10);
        InterfaceC6396rf0<C7606xQ> interfaceC6396rf1 = ((C1259Ix1) obj10).E;
        FP0 viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner10), null, new C0713Bx1(viewLifecycleOwner10, interfaceC6396rf1, null, c2533Yv3, this), 3);
        Object obj11 = this.i;
        Intrinsics.checkNotNull(obj11);
        InterfaceC6396rf0<J32> interfaceC6396rf2 = ((C1259Ix1) obj11).F;
        FP0 viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner11), null, new C0791Cx1(viewLifecycleOwner11, interfaceC6396rf2, null, this), 3);
        Object obj12 = this.i;
        Intrinsics.checkNotNull(obj12);
        C5561ng0 c5561ng5 = ((C1259Ix1) obj12).G;
        FP0 viewLifecycleOwner12 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner12, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner12), null, new C0869Dx1(viewLifecycleOwner12, c5561ng5, null, this), 3);
        Object obj13 = this.i;
        Intrinsics.checkNotNull(obj13);
        C5561ng0 c5561ng6 = ((C1259Ix1) obj13).H;
        FP0 viewLifecycleOwner13 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner13, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner13), null, new C7089ux1(viewLifecycleOwner13, c5561ng6, null, this), 3);
        Object obj14 = this.i;
        Intrinsics.checkNotNull(obj14);
        C1699On1 c1699On3 = ((C1259Ix1) obj14).I;
        FP0 viewLifecycleOwner14 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner14, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner14), null, new C7299vx1(viewLifecycleOwner14, c1699On3, null, this), 3);
        C5189lv.k(C3286d41.a, null, new C1103Gx1(this, null), 3);
        Object obj15 = this.i;
        Intrinsics.checkNotNull(obj15);
        C1259Ix1 c1259Ix1 = (C1259Ix1) obj15;
        if (((Boolean) c1259Ix1.f.B.d.getValue()).booleanValue()) {
            Boolean bool = Boolean.TRUE;
            GP1 gp2 = c1259Ix1.v;
            gp2.getClass();
            gp2.m(null, bool);
        }
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C6399rg c6399rg = new C6399rg(this, 6);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new JX(new C1591Ne1(this, 2), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C1259Ix1.class), new C5620nx1(interfaceC3770fO0A, 0), new C5830ox1(interfaceC3770fO0A), c6399rg);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2533Yv1> g() {
        return this.t;
    }

    public final OQ m() {
        if (this.p.o()) {
            return null;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        OQ oq = new OQ(contextRequireContext, null, 6, 0);
        oq.setId(View.generateViewId());
        ConstraintLayout currentInvestmentCardContainer = ((C2533Yv1) k()).h;
        Intrinsics.checkNotNullExpressionValue(currentInvestmentCardContainer, "currentInvestmentCardContainer");
        Od2 block = new Od2(currentInvestmentCardContainer, null);
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(block, "block");
        AH1 ah1 = new AH1();
        ah1.h = C5885pC0.a(ah1, ah1, block);
        do {
            if (!ah1.hasNext()) {
                ((C2533Yv1) k()).h.addView(oq, 0);
                break;
            }
        } while (!(((View) ah1.next()) instanceof OQ));
        ViewGroup.LayoutParams layoutParams = oq.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = 0;
        layoutParams.width = 0;
        oq.setLayoutParams(layoutParams);
        ConstraintLayout currentInvestmentCardContainer2 = ((C2533Yv1) k()).h;
        Intrinsics.checkNotNullExpressionValue(currentInvestmentCardContainer2, "currentInvestmentCardContainer");
        C4987kx1 block2 = new C4987kx1(0, oq, this);
        Intrinsics.checkNotNullParameter(currentInvestmentCardContainer2, "<this>");
        Intrinsics.checkNotNullParameter(block2, "block");
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.e(currentInvestmentCardContainer2);
        block2.invoke(cVar);
        cVar.b(currentInvestmentCardContainer2);
        oq.s(new Q2(this, 7), new C6040px1(k(), C2533Yv1.class, "materialCardView", "getMaterialCardView()Lcom/google/android/material/card/MaterialCardView;", 0));
        InterfaceC2124Tz0 interfaceC2124Tz0 = this.n;
        interfaceC2124Tz0.a(oq);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        AbstractC7721xy abstractC7721xy = (AbstractC7721xy) ((C1259Ix1) obj).u.d.getValue();
        if (abstractC7721xy instanceof AbstractC7721xy.b) {
            ArrayList arrayList = ((AbstractC7721xy.b) abstractC7721xy).a;
            Object obj2 = this.i;
            Intrinsics.checkNotNull(obj2);
            C1259Ix1 c1259Ix1 = (C1259Ix1) obj2;
            List<SZ1> listA = c1259Ix1.o.a();
            C1804Pw1 c1804Pw1 = c1259Ix1.h;
            C5653o60 c5653o60 = c1804Pw1.c.l;
            if (((Boolean) c1804Pw1.d.getValue()).booleanValue()) {
                listA = c5653o60;
            }
            interfaceC2124Tz0.c(arrayList, listA);
            oq.setVisibility(4);
        }
        return oq;
    }

    public final void n() {
        ConstraintLayout currentInvestmentCardContainer = ((C2533Yv1) k()).h;
        Intrinsics.checkNotNullExpressionValue(currentInvestmentCardContainer, "currentInvestmentCardContainer");
        Od2 block = new Od2(currentInvestmentCardContainer, null);
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(block, "block");
        AH1 ah1 = new AH1();
        ah1.h = C5885pC0.a(ah1, ah1, block);
        int i = 0;
        while (ah1.hasNext()) {
            if ((((View) ah1.next()) instanceof OQ) && (i = i + 1) < 0) {
                WE.k();
                throw null;
            }
        }
        if (i != 0) {
            ((C2533Yv1) k()).h.removeViewAt(0);
        }
        this.r = null;
    }

    @Override // com.api.core.SimpleViewModelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        n();
        super.onDestroyView();
    }
}
