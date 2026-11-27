package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Xe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2403Xe0 {

    /* JADX INFO: renamed from: Xe0$a */
    public static final class a implements InterfaceC2403Xe0 {

        @NotNull
        public static final a a = new a();

        @Override // defpackage.InterfaceC2403Xe0
        @NotNull
        public final AbstractC4649jL0 a(@NotNull C4267hk1 proto, @NotNull String flexibleId, @NotNull AbstractC5706oM1 lowerBound, @NotNull AbstractC5706oM1 upperBound) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    @NotNull
    AbstractC4649jL0 a(@NotNull C4267hk1 c4267hk1, @NotNull String str, @NotNull AbstractC5706oM1 abstractC5706oM1, @NotNull AbstractC5706oM1 abstractC5706oM2);
}
