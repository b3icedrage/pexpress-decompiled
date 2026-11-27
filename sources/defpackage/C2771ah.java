package defpackage;

import com.pexpress.tool.AppImpl;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2771ah implements InterfaceC1294Jj0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1294Jj0
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        String method = (String) obj;
        String url = (String) obj2;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        this.d.U(((Integer) obj3).intValue(), method, url, ((Long) obj4).longValue(), (String) obj5, (String) serializable);
        return Unit.a;
    }
}
