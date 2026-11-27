package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2262Vt0 {

    /* JADX INFO: renamed from: Vt0$a */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object listNotificationsForOutstanding$default(InterfaceC2262Vt0 interfaceC2262Vt0, List list, JM jm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return interfaceC2262Vt0.listNotificationsForOutstanding(list, jm);
        }

        public static /* synthetic */ Object markAsConsumed$default(InterfaceC2262Vt0 interfaceC2262Vt0, int i, boolean z, String str, boolean z2, JM jm, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsConsumed");
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            String str2 = str;
            if ((i2 & 8) != 0) {
                z2 = true;
            }
            return interfaceC2262Vt0.markAsConsumed(i, z, str2, z2, jm);
        }
    }

    /* JADX INFO: renamed from: Vt0$b */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"LVt0$b;", "", "", "androidId", "", "id", "fullData", "", "createdAt", "title", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "I", "getAndroidId", "()I", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getFullData", "J", "getCreatedAt", "()J", "getTitle", "getMessage", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        private final int androidId;
        private final long createdAt;

        @NotNull
        private final String fullData;

        @NotNull
        private final String id;

        @Nullable
        private final String message;

        @Nullable
        private final String title;

        public b(int i, @NotNull String id, @NotNull String fullData, long j, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(fullData, "fullData");
            this.androidId = i;
            this.id = id;
            this.fullData = fullData;
            this.createdAt = j;
            this.title = str;
            this.message = str2;
        }

        public final int getAndroidId() {
            return this.androidId;
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final String getFullData() {
            return this.fullData;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }
    }

    @Nullable
    Object clearOldestOverLimitFallback(int i, int i2, @NotNull JM<? super Unit> jm);

    @Nullable
    Object createNotification(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z, boolean z2, int i, @Nullable String str4, @Nullable String str5, long j, @NotNull String str6, @NotNull JM<? super Unit> jm);

    @Nullable
    Object createSummaryNotification(int i, @NotNull String str, @NotNull JM<? super Unit> jm);

    @Nullable
    Object deleteExpiredNotifications(@NotNull JM<? super Unit> jm);

    @Nullable
    Object doesNotificationExist(@Nullable String str, @NotNull JM<? super Boolean> jm);

    @Nullable
    Object getAndroidIdForGroup(@NotNull String str, boolean z, @NotNull JM<? super Integer> jm);

    @Nullable
    Object getAndroidIdFromCollapseKey(@NotNull String str, @NotNull JM<? super Integer> jm);

    @Nullable
    Object getGroupId(int i, @NotNull JM<? super String> jm);

    @Nullable
    Object listNotificationsForGroup(@NotNull String str, @NotNull JM<? super List<b>> jm);

    @Nullable
    Object listNotificationsForOutstanding(@Nullable List<Integer> list, @NotNull JM<? super List<b>> jm);

    @Nullable
    Object markAsConsumed(int i, boolean z, @Nullable String str, boolean z2, @NotNull JM<? super Unit> jm);

    @Nullable
    Object markAsDismissed(int i, @NotNull JM<? super Boolean> jm);

    @Nullable
    Object markAsDismissedForGroup(@NotNull String str, @NotNull JM<? super Unit> jm);

    @Nullable
    Object markAsDismissedForOutstanding(@NotNull JM<? super Unit> jm);
}
