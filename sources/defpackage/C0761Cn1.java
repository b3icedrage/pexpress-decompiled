package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Cn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0761Cn1 extends C0683Bn1.a {
    public final /* synthetic */ C0683Bn1.b b;

    public C0761Cn1(C0683Bn1.b bVar) {
        this.b = bVar;
    }

    @Override // defpackage.C0683Bn1.a
    public final void f(@NotNull String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
        }
        C0683Bn1.this.d = strArr;
    }
}
