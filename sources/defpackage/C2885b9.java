package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2885b9 extends ML0 implements Function1<C3513e9, Boolean> {
    public final /* synthetic */ S8 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2885b9(S8 s8, String str, String str2) {
        super(1);
        this.d = s8;
        this.e = str;
        this.g = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C3513e9 c3513e9) {
        C3513e9 it = c3513e9;
        Intrinsics.checkNotNullParameter(it, "it");
        C7129v8 c7129v8 = (C7129v8) this.d.h.get(this.e);
        return Boolean.valueOf(!Intrinsics.a(c7129v8 != null ? c7129v8.d : null, this.g));
    }
}
