package defpackage;

import com.jivosite.sdk.di.modules.MessageStatusJsonAdapter;
import com.jivosite.sdk.di.modules.RateSettingsIconJsonAdapter;
import com.jivosite.sdk.di.modules.RateSettingsTypeJsonAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4703jc1 implements InterfaceC5331mb0<C3903g11> {
    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C3903g11.a aVar = new C3903g11.a();
        aVar.a(new MessageStatusJsonAdapter());
        aVar.a(new RateSettingsTypeJsonAdapter());
        aVar.a(new RateSettingsIconJsonAdapter());
        C3903g11 c3903g11 = new C3903g11(aVar);
        Intrinsics.checkNotNullExpressionValue(c3903g11, "Builder()\n            .a…r())\n            .build()");
        return c3903g11;
    }
}
