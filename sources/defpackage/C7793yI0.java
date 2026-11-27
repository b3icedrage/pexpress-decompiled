package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7793yI0 extends AbstractC5393ms {

    @NotNull
    public static final C7793yI0 g;

    @NotNull
    public static final C7793yI0 h;
    public final boolean f;

    static {
        C7793yI0 c7793yI0 = new C7793yI0(2, 0, 0);
        g = c7793yI0;
        int i = c7793yI0.c;
        int i2 = c7793yI0.b;
        h = (i2 == 1 && i == 9) ? new C7793yI0(2, 0, 0) : new C7793yI0(i2, i + 1, 0);
        new C7793yI0(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7793yI0(@NotNull int[] versionArray, boolean z) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        this.f = z;
    }

    public final boolean b(@NotNull C7793yI0 metadataVersionFromLanguageVersion) {
        Intrinsics.checkNotNullParameter(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        C7793yI0 c7793yI0 = g;
        int i = this.b;
        int i2 = this.c;
        if (i == 2 && i2 == 0 && c7793yI0.b == 1 && c7793yI0.c == 8) {
            return true;
        }
        metadataVersionFromLanguageVersion.getClass();
        if (!this.f) {
            c7793yI0 = h;
        }
        c7793yI0.getClass();
        int i3 = metadataVersionFromLanguageVersion.b;
        int i4 = c7793yI0.b;
        if (i4 > i3 || (i4 >= i3 && c7793yI0.c > metadataVersionFromLanguageVersion.c)) {
            metadataVersionFromLanguageVersion = c7793yI0;
        }
        boolean z = false;
        if ((i == 1 && i2 == 0) || i == 0) {
            return false;
        }
        int i5 = metadataVersionFromLanguageVersion.b;
        if (i > i5 || (i >= i5 && i2 > metadataVersionFromLanguageVersion.c)) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7793yI0(@NotNull int... numbers) {
        this(numbers, false);
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }
}
