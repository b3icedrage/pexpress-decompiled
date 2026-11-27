package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: q71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6078q71<T> implements RJ0<T> {

    @NotNull
    public final RJ0<T> a;

    @NotNull
    public final NH1 b;

    public C6078q71(@NotNull RJ0<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.a = serializer;
        this.b = new NH1(serializer.c());
    }

    @Override // defpackage.RJ0
    public final void a(@NotNull C3783fS1 encoder, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj != null) {
            encoder.f(this.a, obj);
        } else {
            encoder.e();
        }
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.b;
    }

    @Override // defpackage.RJ0
    @Nullable
    public final T d(@NotNull InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder.w()) {
            return (T) decoder.d(this.a);
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C6078q71.class == obj.getClass() && Intrinsics.a(this.a, ((C6078q71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
