package defpackage;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ui0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2151Ui0 {
    @NotNull
    public static final v a(@NotNull Fragment fragment, @NotNull RI0 viewModelClass, @NotNull Function0 storeProducer, @NotNull Function0 extrasProducer, @Nullable Function0 function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        return new v(viewModelClass, storeProducer, function0, extrasProducer);
    }
}
