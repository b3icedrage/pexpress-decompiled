package defpackage;

import com.pexpress.tool.AppImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4462ih implements Function2 {
    public final /* synthetic */ InterfaceC3706f42 d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object error, Object obj) {
        String requestId = (String) obj;
        int i = AppImpl.G;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        C2099Tr c2099Tr = error instanceof C2099Tr ? (C2099Tr) error : null;
        if (c2099Tr != null) {
            this.d.f(c2099Tr, requestId);
        }
        return Unit.a;
    }
}
