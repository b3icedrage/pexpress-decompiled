package defpackage;

import com.base.feature.robot.indicatorselection.screens.ungrouped_indicators.IndicatorSelectionBottomSheetDialogFragment;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4927kg implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4927kg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.d) {
            case 0:
                ((C6481s31) this.e).invoke();
                return Unit.a;
            case 1:
                return ((IndicatorSelectionBottomSheetDialogFragment) this.e).k;
            case 2:
                ((ON0) this.e).i.e();
                return Unit.a;
            case 3:
                return new C0658Bf0(Boolean.valueOf(((C0980Fi1) this.e).y.n()));
            case 4:
                ((Function0) this.e).invoke();
                return Unit.a;
            case 5:
                C1486Lv1 c1486Lv1 = (C1486Lv1) this.e;
                c1486Lv1.m.f.a(c1486Lv1.n());
                return Unit.a;
            case 6:
                CQ0 cq0B = VE.b();
                Integer numValueOf = Integer.valueOf(R.string.trade_with_ai_title);
                Integer numValueOf2 = Integer.valueOf(R.string.trade_with_ai_text);
                ((C2942bR1) this.e).getClass();
                cq0B.add(WE.f(new C3151cR1(numValueOf, null, numValueOf2, null, C2942bR1.c("ai_indicator"), 429), new C3151cR1(Integer.valueOf(R.string.stories_title_tech_analysis_1_2_text), null, Integer.valueOf(R.string.stories_description_1_2_text), null, C2942bR1.c("analysis"), 429), new C3151cR1(Integer.valueOf(R.string.stories_tittle_1_1_text), VE.c(Integer.valueOf(R.string.percent_profit_with_signals_without_plus)), Integer.valueOf(R.string.stories_description_1_1_text), null, C2942bR1.c("accuracy"), 425)));
                cq0B.add(WE.f(new C3151cR1(Integer.valueOf(R.string.stories_tittle_2_1_text), null, Integer.valueOf(R.string.stories_description_2_1_text), WE.f(Integer.valueOf(R.string.app_name), Integer.valueOf(R.string.platform_name)), C2942bR1.c("investing_flags"), 397), new C3151cR1(Integer.valueOf(R.string.stories_tittle_2_2_text), null, Integer.valueOf(R.string.stories_description_2_2_text), null, C2942bR1.c("investing_settings"), 429)));
                cq0B.add(VE.c(new C3151cR1(Integer.valueOf(R.string.instant_support_label), null, Integer.valueOf(R.string.stories_description_4_1_text), null, C2942bR1.c("support_questions"), 429)));
                return VE.a(cq0B);
            case 7:
                C7152vF c7152vF = (C7152vF) ((C4923kf) this.e).p.getValue();
                if (c7152vF != null) {
                    z = c7152vF.a.isEmpty() ^ true;
                }
                return Boolean.valueOf(z);
            case 8:
                Ya2 ya2 = (Ya2) this.e;
                Intrinsics.c(ya2, "null cannot be cast to non-null type com.impl.core.backend.data_sources.UserDataSourceImpl");
                return (C2750ab2) ya2;
            default:
                Fg2<?> fg2 = ((C7242vg2) this.e).l;
                if (fg2 != null) {
                    return fg2;
                }
                throw new IllegalStateException("webSocket listener error: ws executor has not been set");
        }
    }
}
