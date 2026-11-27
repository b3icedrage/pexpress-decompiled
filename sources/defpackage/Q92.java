package defpackage;

import androidx.lifecycle.LiveData;
import com.jivosite.sdk.model.pojo.push.Device;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class Q92 extends ML0 implements Function0<LiveData<C4705jd<Object>>> {
    public final /* synthetic */ W92 d;
    public final /* synthetic */ Device e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q92(W92 w92, Device device) {
        super(0);
        this.d = w92;
        this.e = device;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LiveData<C4705jd<Object>> invoke() {
        W92 w92 = this.d;
        InterfaceC3432dl1 interfaceC3432dl1 = w92.d;
        String id = w92.e.getId();
        long j = Long.parseLong(w92.c.d());
        String str = w92.f;
        if (str == null) {
            Intrinsics.l("widgetId");
            throw null;
        }
        if (StringsKt.I(str)) {
            str = w92.a.b;
        }
        return interfaceC3432dl1.b(id, j, str, this.e);
    }
}
