package defpackage;

import android.view.View;
import com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesPart;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3257cw1 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC3257cw1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                Object obj2 = ((RobotDoubleStrategiesPart) obj).i;
                Intrinsics.checkNotNull(obj2);
                C4984kw1 c4984kw1 = (C4984kw1) obj2;
                c4984kw1.getClass();
                C6561sS.g(c4984kw1, new C5194lw1(c4984kw1, null));
                break;
            case 1:
                int i = RobotInvestmentPart.v;
                Object obj3 = ((RobotInvestmentPart) obj).i;
                Intrinsics.checkNotNull(obj3);
                C1259Ix1 c1259Ix1 = (C1259Ix1) obj3;
                c1259Ix1.l.getClass();
                c1259Ix1.k.a(new W82(R.string.unlock_ai_indicator_title, R.string.unlock_ai_indicator_text, C4777jx1.a("ai_illustration"), new C7239vg(c1259Ix1, 4)));
                c1259Ix1.e.e();
                break;
            default:
                ((C1334Jw1) obj).g.performClick();
                break;
        }
    }
}
