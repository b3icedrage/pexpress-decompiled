package defpackage;

import androidx.constraintlayout.widget.c;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4987kx1 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C4987kx1(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.g;
        Object obj3 = this.e;
        switch (this.d) {
            case 0:
                c updateConstraints = (c) obj;
                int i = RobotInvestmentPart.v;
                Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
                Iterator it = WE.f(3, 6, 4, 7).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    int id = ((OQ) obj3).getId();
                    int id2 = ((C2533Yv1) ((RobotInvestmentPart) obj2).k()).g.getId();
                    HashMap<Integer, c.a> map = updateConstraints.f;
                    if (!map.containsKey(Integer.valueOf(id))) {
                        map.put(Integer.valueOf(id), new c.a());
                    }
                    c.a aVar = map.get(Integer.valueOf(id));
                    if (aVar != null) {
                        c.b bVar = aVar.e;
                        switch (iIntValue) {
                            case 1:
                                if (iIntValue == 1) {
                                    bVar.i = id2;
                                    bVar.j = -1;
                                } else {
                                    if (iIntValue != 2) {
                                        throw new IllegalArgumentException("left to " + c.p(iIntValue) + " undefined");
                                    }
                                    bVar.j = id2;
                                    bVar.i = -1;
                                }
                                break;
                            case 2:
                                if (iIntValue == 1) {
                                    bVar.k = id2;
                                    bVar.l = -1;
                                } else {
                                    if (iIntValue != 2) {
                                        throw new IllegalArgumentException("right to " + c.p(iIntValue) + " undefined");
                                    }
                                    bVar.l = id2;
                                    bVar.k = -1;
                                }
                                break;
                            case 3:
                                if (iIntValue == 3) {
                                    bVar.m = id2;
                                    bVar.n = -1;
                                    bVar.q = -1;
                                    bVar.r = -1;
                                    bVar.s = -1;
                                } else {
                                    if (iIntValue != 4) {
                                        throw new IllegalArgumentException("right to " + c.p(iIntValue) + " undefined");
                                    }
                                    bVar.n = id2;
                                    bVar.m = -1;
                                    bVar.q = -1;
                                    bVar.r = -1;
                                    bVar.s = -1;
                                }
                                break;
                            case 4:
                                if (iIntValue == 4) {
                                    bVar.p = id2;
                                    bVar.o = -1;
                                    bVar.q = -1;
                                    bVar.r = -1;
                                    bVar.s = -1;
                                } else {
                                    if (iIntValue != 3) {
                                        throw new IllegalArgumentException("right to " + c.p(iIntValue) + " undefined");
                                    }
                                    bVar.o = id2;
                                    bVar.p = -1;
                                    bVar.q = -1;
                                    bVar.r = -1;
                                    bVar.s = -1;
                                }
                                break;
                            case 5:
                                if (iIntValue == 5) {
                                    bVar.q = id2;
                                    bVar.p = -1;
                                    bVar.o = -1;
                                    bVar.m = -1;
                                    bVar.n = -1;
                                } else if (iIntValue == 3) {
                                    bVar.r = id2;
                                    bVar.p = -1;
                                    bVar.o = -1;
                                    bVar.m = -1;
                                    bVar.n = -1;
                                } else {
                                    if (iIntValue != 4) {
                                        throw new IllegalArgumentException("right to " + c.p(iIntValue) + " undefined");
                                    }
                                    bVar.s = id2;
                                    bVar.p = -1;
                                    bVar.o = -1;
                                    bVar.m = -1;
                                    bVar.n = -1;
                                }
                                break;
                            case 6:
                                if (iIntValue == 6) {
                                    bVar.u = id2;
                                    bVar.t = -1;
                                } else {
                                    if (iIntValue != 7) {
                                        throw new IllegalArgumentException("right to " + c.p(iIntValue) + " undefined");
                                    }
                                    bVar.t = id2;
                                    bVar.u = -1;
                                }
                                break;
                            case 7:
                                if (iIntValue == 7) {
                                    bVar.w = id2;
                                    bVar.v = -1;
                                } else {
                                    if (iIntValue != 6) {
                                        throw new IllegalArgumentException("right to " + c.p(iIntValue) + " undefined");
                                    }
                                    bVar.v = id2;
                                    bVar.w = -1;
                                }
                                break;
                            default:
                                throw new IllegalArgumentException(c.p(iIntValue) + " to " + c.p(iIntValue) + " unknown");
                        }
                    }
                }
                return Unit.a;
            default:
                return AFLogger.registerClient((LogTag) obj3, (String) obj2, (AFLoggerBase) obj);
        }
    }
}
