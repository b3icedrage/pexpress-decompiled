package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5023l7<I, O> {

    /* JADX INFO: renamed from: l7$a */
    public static final class a<T> {
        public final Serializable a;

        public a(Serializable serializable) {
            this.a = serializable;
        }
    }

    @NotNull
    public abstract Intent a(@NotNull Context context, I i);

    @Nullable
    public a<O> b(@NotNull Context context, I i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract O c(int i, @Nullable Intent intent);
}
