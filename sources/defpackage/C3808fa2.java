package defpackage;

import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fa2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3808fa2 extends ML0 implements InterfaceC1060Gj0<String, String, AbstractC5395ms1, LiveData<C4705jd<Void>>> {
    public final /* synthetic */ C4228ha2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3808fa2(C4228ha2 c4228ha2) {
        super(3);
        this.d = c4228ha2;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final LiveData<C4705jd<Void>> k(String str, String str2, AbstractC5395ms1 abstractC5395ms1) {
        String url = str2;
        AbstractC5395ms1 body = abstractC5395ms1;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        return this.d.h.a(str, url, body);
    }
}
