package defpackage;

import com.jivosite.sdk.model.pojo.config.Config;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: oE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5682oE1 extends ML0 implements Function1<Config, Boolean> {
    public final /* synthetic */ C5892pE1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5682oE1(C5892pE1 c5892pE1) {
        super(1);
        this.d = c5892pE1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Config config) {
        Config it = config;
        Intrinsics.checkNotNullParameter(it, "it");
        C5892pE1 c5892pE1 = this.d;
        EK1 ek1 = c5892pE1.c;
        String str = it.c;
        ek1.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        IJ0<Object>[] ij0Arr = EK1.z;
        ek1.i.b(ij0Arr[9], str);
        EK1 ek2 = c5892pE1.c;
        ek2.getClass();
        String str2 = it.d;
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        ek2.e.b(ij0Arr[4], str2);
        String str3 = it.e;
        Intrinsics.checkNotNullParameter(str3, "<set-?>");
        ek2.f.b(ij0Arr[5], str3);
        String str4 = it.f;
        Intrinsics.checkNotNullParameter(str4, "<set-?>");
        ek2.g.b(ij0Arr[6], str4);
        Boolean bool = it.g;
        c5892pE1.f.w(bool != null ? bool.booleanValue() : true);
        c5892pE1.g.i(it.i);
        return Boolean.valueOf(!StringsKt.I(str3));
    }
}
