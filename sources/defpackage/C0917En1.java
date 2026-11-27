package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: En1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0917En1 extends C0683Bn1.a {
    public final /* synthetic */ C0683Bn1.c b;

    public C0917En1(C0683Bn1.c cVar) {
        this.b = cVar;
    }

    @Override // defpackage.C0683Bn1.a
    public final void f(@NotNull String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
        }
        C0683Bn1.this.h = strArr;
    }
}
