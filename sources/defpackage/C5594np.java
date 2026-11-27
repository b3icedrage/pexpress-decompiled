package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.BackendApiImpl$sendData$2", f = "BackendApiImpl.kt", l = {111}, m = "invokeSuspend")
public final class C5594np extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C5804op e;
    public final /* synthetic */ ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5594np(C5804op c5804op, ArrayList arrayList, JM jm) {
        super(1, jm);
        this.e = c5804op;
        this.g = arrayList;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5594np(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C5594np) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C1782Pp0 c1782Pp0 = this.e.a;
            C3032br0 c3032br0 = new C3032br0();
            Intrinsics.checkNotNullParameter(c3032br0, "<this>");
            Intrinsics.checkNotNullParameter("https://jitsu.pbotservices.com/api/v1/event", "urlString");
            Z72 z72 = c3032br0.a;
            C3512e82.b(z72, "https://jitsu.pbotservices.com/api/v1/event");
            ArrayList arrayList = this.g;
            if (arrayList == null) {
                LE le = LE.h;
                Intrinsics.checkNotNullParameter(le, "<set-?>");
                c3032br0.d = le;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                SJ0 type = C2017Sp1.a(C4672jT.class);
                companion.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                KTypeProjection kTypeProjection = new KTypeProjection(EnumC2920bK0.d, type);
                C2251Vp1 c2251Vp1 = C2017Sp1.a;
                SJ0 sj0J = c2251Vp1.j(c2251Vp1.b(List.class), Collections.singletonList(kTypeProjection));
                c3032br0.b(UE.u(c2251Vp1.b(List.class), sj0J, C7128v72.d(sj0J)));
            } else {
                Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
                c3032br0.d = arrayList;
                KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                SJ0 type2 = C2017Sp1.a(C4672jT.class);
                companion2.getClass();
                Intrinsics.checkNotNullParameter(type2, "type");
                KTypeProjection kTypeProjection2 = new KTypeProjection(EnumC2920bK0.d, type2);
                C2251Vp1 c2251Vp2 = C2017Sp1.a;
                SJ0 sj0J2 = c2251Vp2.j(c2251Vp2.b(List.class), Collections.singletonList(kTypeProjection2));
                c3032br0.b(UE.u(c2251Vp2.b(List.class), sj0J2, C7128v72.d(sj0J2)));
            }
            Intrinsics.checkNotNullParameter(c3032br0, "<this>");
            Intrinsics.checkNotNullParameter("token", "key");
            Ma2 ma2 = z72.j;
            ma2.getClass();
            Intrinsics.checkNotNullParameter("token", AppMeasurementSdk.ConditionalUserProperty.NAME);
            Intrinsics.checkNotNullParameter("js.glzwizhsaraw3ncm6lpa4.1co5ez1ole9vl51nod9lf", AppMeasurementSdk.ConditionalUserProperty.VALUE);
            String strF = BE.f("token", false);
            Intrinsics.checkNotNullParameter("js.glzwizhsaraw3ncm6lpa4.1co5ez1ole9vl51nod9lf", "<this>");
            ma2.a.d(strF, BE.f("js.glzwizhsaraw3ncm6lpa4.1co5ez1ole9vl51nod9lf", true));
            Unit unit = Unit.a;
            c3032br0.c.d("Content-Type", "application/json");
            C1629Nq0 c1629Nq0 = C1629Nq0.c;
            Intrinsics.checkNotNullParameter(c1629Nq0, "<set-?>");
            c3032br0.b = c1629Nq0;
            C0772Cr0 c0772Cr0 = new C0772Cr0(c3032br0, c1782Pp0);
            this.d = 1;
            if (c0772Cr0.b(new C0616Ar0(2, null), this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
