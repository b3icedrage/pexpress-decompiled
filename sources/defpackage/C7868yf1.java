package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7868yf1 extends ML0 implements Function1<YC, Unit> {
    public final /* synthetic */ C8078zf1<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7868yf1(C8078zf1<Object> c8078zf1) {
        super(1);
        this.d = c8078zf1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(YC yc) {
        YC buildSerialDescriptor = yc;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C1173Hv.d(C4881kS1.a);
        YC.a(buildSerialDescriptor, "type", C6144qS1.b);
        StringBuilder sb = new StringBuilder("kotlinx.serialization.Polymorphic<");
        C8078zf1<Object> c8078zf1 = this.d;
        sb.append(c8078zf1.a.f());
        sb.append('>');
        YC.a(buildSerialDescriptor, AppMeasurementSdk.ConditionalUserProperty.VALUE, SH1.c(sb.toString(), VH1.a.a, new MH1[0], RH1.e));
        C5653o60 c5653o60 = c8078zf1.b;
        Intrinsics.checkNotNullParameter(c5653o60, "<set-?>");
        buildSerialDescriptor.b = c5653o60;
        return Unit.a;
    }
}
