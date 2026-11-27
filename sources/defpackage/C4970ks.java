package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4970ks extends C4760js.a {
    public final HashMap<C5638o21, CK<?>> b;
    public final /* synthetic */ C4760js c;
    public final /* synthetic */ FC d;
    public final /* synthetic */ QC e;
    public final /* synthetic */ List<InterfaceC1583Nc> f;
    public final /* synthetic */ VN1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4970ks(C4760js c4760js, FC fc, QC qc, List<InterfaceC1583Nc> list, VN1 vn1) {
        super();
        this.c = c4760js;
        this.d = fc;
        this.e = qc;
        this.f = list;
        this.g = vn1;
        this.b = new HashMap<>();
    }

    @Override // defpackage.InterfaceC2699aL0.a
    public final void a() {
        HashMap<C5638o21, CK<?>> arguments = this.b;
        C4760js c4760js = this.c;
        c4760js.getClass();
        QC annotationClassId = this.e;
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        boolean zO = false;
        if (annotationClassId.equals(C6551sO1.b)) {
            CK<?> ck = arguments.get(C5638o21.k(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            C3965gJ0 c3965gJ0 = ck instanceof C3965gJ0 ? (C3965gJ0) ck : null;
            if (c3965gJ0 != null) {
                Object obj = c3965gJ0.a;
                C3965gJ0.a.b bVar = obj instanceof C3965gJ0.a.b ? (C3965gJ0.a.b) obj : null;
                if (bVar != null) {
                    zO = c4760js.o(bVar.a.a);
                }
            }
        }
        if (zO || c4760js.o(annotationClassId)) {
            return;
        }
        this.f.add(new C1664Oc(this.d.y(), arguments, this.g));
    }

    @Override // defpackage.C4760js.a
    public final void g(C5638o21 c5638o21, CK<?> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.b.put(c5638o21, value);
    }
}
