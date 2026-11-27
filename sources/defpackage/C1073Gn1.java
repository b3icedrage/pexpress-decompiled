package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Gn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1073Gn1 extends C0683Bn1.a {
    public final /* synthetic */ C0683Bn1.d b;

    public C1073Gn1(C0683Bn1.d dVar) {
        this.b = dVar;
    }

    @Override // defpackage.C0683Bn1.a
    public final void f(@NotNull String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
        }
        C0683Bn1.this.e = strArr;
    }
}
