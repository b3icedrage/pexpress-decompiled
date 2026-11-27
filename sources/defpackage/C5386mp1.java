package defpackage;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5386mp1 extends AbstractC5173lp1 implements SD0 {

    @NotNull
    public final Annotation b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5386mp1(@Nullable C5638o21 c5638o21, @NotNull Annotation annotation) {
        super(c5638o21);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.b = annotation;
    }

    @Override // defpackage.SD0
    @NotNull
    public final C4963kp1 a() {
        return new C4963kp1(this.b);
    }
}
