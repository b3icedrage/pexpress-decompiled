package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7079uu0 {

    /* JADX INFO: renamed from: uu0$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Luu0$a;", "", "", "id", "LGU1;", "status", "<init>", "(Ljava/lang/String;LGU1;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "LGU1;", "getStatus", "()LGU1;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {

        @Nullable
        private final String id;

        @NotNull
        private final GU1 status;

        public a(@Nullable String str, @NotNull GU1 status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.id = str;
            this.status = status;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final GU1 getStatus() {
            return this.status;
        }
    }

    @Nullable
    Object registerForPush(@NotNull JM<? super a> jm);
}
