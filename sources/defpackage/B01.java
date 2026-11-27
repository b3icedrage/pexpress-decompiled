package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class B01 extends ZH1 {

    @NotNull
    public final ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B01(@NotNull ArrayList missingFields, @Nullable String str, @Nullable B01 b01) {
        super(str, b01);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.d = missingFields;
    }
}
