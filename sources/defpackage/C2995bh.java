package defpackage;

import com.pexpress.tool.AppImpl;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2995bh implements InterfaceC1216Ij0 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // defpackage.InterfaceC1216Ij0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        String method = (String) obj;
        String url = (String) obj2;
        Throwable throwable = (Throwable) obj3;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.d.I(method, url, throwable, ((Long) obj4).longValue(), (String) serializable);
        return Unit.a;
    }
}
