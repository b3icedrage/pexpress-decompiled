package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7152vF {

    @NotNull
    public final ArrayList a;

    @NotNull
    public final ArrayList b;

    public C7152vF(@NotNull ArrayList assets, @NotNull ArrayList groupTranslation) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(groupTranslation, "groupTranslation");
        this.a = assets;
        this.b = groupTranslation;
    }
}
