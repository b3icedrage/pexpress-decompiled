package defpackage;

import io.sentry.android.replay.capture.AbstractC4515a;
import io.sentry.android.replay.k;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6254qz extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6254qz(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listD;
        switch (this.d) {
            case 0:
                G1 g1 = ((C6044pz) this.e).b;
                List<Certificate> list = (List) this.g;
                if (g1 != null && (listD = g1.d((String) this.h, list)) != null) {
                    list = listD;
                }
                ArrayList arrayList = new ArrayList(XE.m(list, 10));
                for (Certificate certificate : list) {
                    Intrinsics.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                k kVar = ((AbstractC4515a) this.h).h;
                if (kVar != null) {
                    Date date = (Date) this.g;
                    kVar.k("segment.timestamp", date == null ? null : N7.q(date));
                }
                return Unit.a;
        }
    }
}
