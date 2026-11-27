package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: z62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7965z62 {

    @NotNull
    public static final C2878b70 a;

    @NotNull
    public static final C2878b70 b;

    /* JADX INFO: renamed from: z62$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5238m71.values().length];
            try {
                EnumC5238m71 enumC5238m71 = EnumC5238m71.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC5238m71 enumC5238m72 = EnumC5238m71.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    static {
        C1758Ph0 ENHANCED_NULLABILITY_ANNOTATION = C3333dI0.p;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        a = new C2878b70(ENHANCED_NULLABILITY_ANNOTATION);
        C1758Ph0 ENHANCED_MUTABILITY_ANNOTATION = C3333dI0.q;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        b = new C2878b70(ENHANCED_MUTABILITY_ANNOTATION);
    }
}
