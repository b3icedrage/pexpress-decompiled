package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4933kh1 extends LQ0 {

    @NotNull
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4933kh1(@NotNull MH1 primitive) {
        super(primitive);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.b = primitive.a() + "Array";
    }

    @Override // defpackage.MH1
    @NotNull
    public final String a() {
        return this.b;
    }
}
