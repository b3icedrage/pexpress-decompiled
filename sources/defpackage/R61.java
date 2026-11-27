package defpackage;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001FB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ#\u0010 \u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!Jk\u0010*\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u00172\b\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J5\u0010/\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010\u00172\u0006\u0010.\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u0010\u001cJ\u001d\u00102\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\"\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001aJ#\u00105\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b5\u00106J!\u00109\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010-\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b9\u0010\u001aJ%\u0010;\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b;\u0010<J)\u0010>\u001a\b\u0012\u0004\u0012\u000208072\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u000107H\u0096@ø\u0001\u0000¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010D\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"LR61;", "LVt0;", "LWr0;", "_applicationService", "LUt0;", "_queryHelper", "Lus0;", "_databaseProvider", "Lgv0;", "_time", "LZr0;", "_badgeCountUpdater", "<init>", "(LWr0;LUt0;Lus0;Lgv0;LZr0;)V", "", "androidId", "", "internalMarkAsDismissed", "(I)Z", "", "deleteExpiredNotifications", "(LJM;)Ljava/lang/Object;", "markAsDismissedForOutstanding", "", "group", "markAsDismissedForGroup", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "markAsDismissed", "(ILJM;)Ljava/lang/Object;", "id", "doesNotificationExist", "groupId", "createSummaryNotification", "(ILjava/lang/String;LJM;)Ljava/lang/Object;", "collapseKey", "shouldDismissIdenticals", "isOpened", "title", "body", "", "expireTime", "jsonPayload", "createNotification", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;JLjava/lang/String;LJM;)Ljava/lang/Object;", "dismissed", "summaryGroup", "clearGroupOnSummaryClick", "markAsConsumed", "(IZLjava/lang/String;ZLJM;)Ljava/lang/Object;", "getGroupId", "getAndroidIdFromCollapseKey", "notificationsToMakeRoomFor", "maxNumberOfNotificationsInt", "clearOldestOverLimitFallback", "(IILJM;)Ljava/lang/Object;", "", "LVt0$b;", "listNotificationsForGroup", "getSummaryNotification", "getAndroidIdForGroup", "(Ljava/lang/String;ZLJM;)Ljava/lang/Object;", "excludeAndroidIds", "listNotificationsForOutstanding", "(Ljava/util/List;LJM;)Ljava/lang/Object;", "LWr0;", "LUt0;", "Lus0;", "Lgv0;", "LZr0;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class R61 implements InterfaceC2262Vt0 {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC2598Zr0 _badgeCountUpdater;

    @NotNull
    private final InterfaceC7073us0 _databaseProvider;

    @NotNull
    private final InterfaceC2184Ut0 _queryHelper;

    @NotNull
    private final InterfaceC4092gv0 _time;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", C1575Mz0.NOTIFICATION_ID_TAG, "android_notification_id", "full_data", "created_time"};

    /* JADX INFO: renamed from: R61$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LR61$a;", "", "<init>", "()V", "", "", "COLUMNS_FOR_LIST_NOTIFICATIONS", "[Ljava/lang/String;", "getCOLUMNS_FOR_LIST_NOTIFICATIONS", "()[Ljava/lang/String;", "", "NOTIFICATION_CACHE_DATA_LIFETIME", "J", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return R61.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }

        private Companion() {
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$clearOldestOverLimitFallback$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ R61 this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ R61 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i2, R61 r61) {
                super(1);
                this.$maxNumberOfNotificationsInt = i;
                this.$notificationsToMakeRoomFor = i2;
                this.this$0 = r61;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                int count = (it.getCount() - this.$maxNumberOfNotificationsInt) + this.$notificationsToMakeRoomFor;
                if (count < 1) {
                    return;
                }
                while (it.moveToNext()) {
                    this.this$0.internalMarkAsDismissed(it.getInt("android_notification_id"));
                    count--;
                    if (count <= 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, R61 r61, int i2, JM<? super b> jm) {
            super(2, jm);
            this.$maxNumberOfNotificationsInt = i;
            this.this$0 = r61;
            this.$notificationsToMakeRoomFor = i2;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            String strValueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                InterfaceC6863ts0.a.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", strValueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                NS0.error("Error clearing oldest notifications over limit! ", th);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$createNotification$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $body;
        final /* synthetic */ String $collapseKey;
        final /* synthetic */ long $expireTime;
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $id;
        final /* synthetic */ boolean $isOpened;
        final /* synthetic */ String $jsonPayload;
        final /* synthetic */ boolean $shouldDismissIdenticals;
        final /* synthetic */ String $title;
        int label;
        final /* synthetic */ R61 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z, int i, R61 r61, String str2, String str3, boolean z2, String str4, String str5, long j, String str6, JM<? super c> jm) {
            super(2, jm);
            this.$id = str;
            this.$shouldDismissIdenticals = z;
            this.$androidId = i;
            this.this$0 = r61;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z2;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j;
            this.$jsonPayload = str6;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            NS0.debug$default("Saving Notification id=" + this.$id, null, 2, null);
            try {
                if (this.$shouldDismissIdenticals) {
                    String str = "android_notification_id = " + this.$androidId;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dismissed", new Integer(1));
                    this.this$0._databaseProvider.getOs().update("notification", contentValues, str, null);
                    this.this$0._badgeCountUpdater.update();
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(C1575Mz0.NOTIFICATION_ID_TAG, this.$id);
                String str2 = this.$groupId;
                if (str2 != null) {
                    contentValues2.put("group_id", str2);
                }
                String str3 = this.$collapseKey;
                if (str3 != null) {
                    contentValues2.put("collapse_id", str3);
                }
                contentValues2.put("opened", new Integer(this.$isOpened ? 1 : 0));
                if (!this.$isOpened) {
                    contentValues2.put("android_notification_id", new Integer(this.$androidId));
                }
                String str4 = this.$title;
                if (str4 != null) {
                    contentValues2.put("title", str4);
                }
                String str5 = this.$body;
                if (str5 != null) {
                    contentValues2.put("message", str5);
                }
                contentValues2.put("expire_time", new Long(this.$expireTime));
                contentValues2.put("full_data", this.$jsonPayload);
                this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues2);
                NS0.debug$default("Notification saved values: " + contentValues2, null, 2, null);
                if (!this.$isOpened) {
                    this.this$0._badgeCountUpdater.update();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$createSummaryNotification$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ R61 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, String str, R61 r61, JM<? super d> jm) {
            super(2, jm);
            this.$androidId = i;
            this.$groupId = str;
            this.this$0 = r61;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new d(this.$androidId, this.$groupId, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", new Integer(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put("is_summary", new Integer(1));
            this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$deleteExpiredNotifications$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        int label;

        public e(JM<? super e> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return R61.this.new e(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            String strValueOf = String.valueOf((R61.this._time.getCurrentTimeMillis() / 1000) - R61.NOTIFICATION_CACHE_DATA_LIFETIME);
            Intrinsics.checkNotNullExpressionValue(strValueOf, "valueOf(\n               …FETIME,\n                )");
            R61.this._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{strValueOf});
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", f = "NotificationRepository.kt", l = {162}, m = "doesNotificationExist")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(JM<? super f> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return R61.this.doesNotificationExist(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$doesNotificationExist$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class g extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ String $id;
        final /* synthetic */ C2512Yo1 $result;
        int label;
        final /* synthetic */ R61 this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ String $id;
            final /* synthetic */ C2512Yo1 $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, C2512Yo1 c2512Yo1) {
                super(1);
                this.$id = str;
                this.$result = c2512Yo1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    NS0.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.d = true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, R61 r61, C2512Yo1 c2512Yo1, JM<? super g> jm) {
            super(2, jm);
            this.$id = str;
            this.this$0 = r61;
            this.$result = c2512Yo1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new g(this.$id, this.this$0, this.$result, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((g) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            String[] strArr = {C1575Mz0.NOTIFICATION_ID_TAG};
            String str = this.$id;
            Intrinsics.checkNotNull(str);
            InterfaceC6863ts0.a.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, null, null, null, null, new a(this.$id, this.$result), 240, null);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", f = "NotificationRepository.kt", l = {515}, m = "getAndroidIdForGroup")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(JM<? super h> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return R61.this.getAndroidIdForGroup(null, false, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdForGroup$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class i extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<Integer> $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ C3027bp1<String> $whereStr;
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ C3027bp1<Integer> $recentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3027bp1<Integer> c3027bp1) {
                super(1);
                this.$recentId = c3027bp1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                boolean zMoveToFirst = it.moveToFirst();
                this.$recentId.d = !zMoveToFirst ? 0 : Integer.valueOf(it.getInt("android_notification_id"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C3027bp1<String> c3027bp1, String[] strArr, C3027bp1<Integer> c3027bp2, JM<? super i> jm) {
            super(2, jm);
            this.$whereStr = c3027bp1;
            this.$whereArgs = strArr;
            this.$recentId = c3027bp2;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return R61.this.new i(this.$whereStr, this.$whereArgs, this.$recentId, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((i) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            InterfaceC6863ts0.a.query$default(R61.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.$whereStr.d, this.$whereArgs, null, null, "created_time DESC", "1", new a(this.$recentId), 48, null);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", f = "NotificationRepository.kt", l = {381}, m = "getAndroidIdFromCollapseKey")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class j extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(JM<? super j> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return R61.this.getAndroidIdFromCollapseKey(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdFromCollapseKey$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class k extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<Integer> $androidId;
        final /* synthetic */ String $collapseKey;
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ C3027bp1<Integer> $androidId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3027bp1<Integer> c3027bp1) {
                super(1);
                this.$androidId = c3027bp1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Integer] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    this.$androidId.d = Integer.valueOf(it.getInt("android_notification_id"));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, C3027bp1<Integer> c3027bp1, JM<? super k> jm) {
            super(2, jm);
            this.$collapseKey = str;
            this.$androidId = c3027bp1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return R61.this.new k(this.$collapseKey, this.$androidId, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((k) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            InterfaceC6863ts0.a.query$default(R61.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new a(this.$androidId), 240, null);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", f = "NotificationRepository.kt", l = {361}, m = "getGroupId")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class l extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public l(JM<? super l> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return R61.this.getGroupId(0, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$getGroupId$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class m extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ int $androidId;
        final /* synthetic */ C3027bp1<String> $groupId;
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ C3027bp1<String> $groupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3027bp1<String> c3027bp1) {
                super(1);
                this.$groupId = c3027bp1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    this.$groupId.d = it.getOptString("group_id");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i, C3027bp1<String> c3027bp1, JM<? super m> jm) {
            super(2, jm);
            this.$androidId = i;
            this.$groupId = c3027bp1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return R61.this.new m(this.$androidId, this.$groupId, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((m) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            InterfaceC6863ts0.a.query$default(R61.this._databaseProvider.getOs(), "notification", new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new a(this.$groupId), 248, null);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", f = "NotificationRepository.kt", l = {440}, m = "listNotificationsForGroup")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class n extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public n(JM<? super n> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return R61.this.listNotificationsForGroup(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForGroup$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class o extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ List<InterfaceC2262Vt0.b> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ R61 this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ List<InterfaceC2262Vt0.b> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<InterfaceC2262Vt0.b> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    do {
                        try {
                            String optString = it.getOptString("title");
                            String optString2 = it.getOptString("message");
                            this.$listOfNotifications.add(new InterfaceC2262Vt0.b(it.getInt("android_notification_id"), it.getString(C1575Mz0.NOTIFICATION_ID_TAG), it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            NS0.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, R61 r61, List<InterfaceC2262Vt0.b> list, JM<? super o> jm) {
            super(2, jm);
            this.$summaryGroup = str;
            this.this$0 = r61;
            this.$listOfNotifications = list;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((o) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            InterfaceC6863ts0.a.query$default(this.this$0._databaseProvider.getOs(), "notification", R61.INSTANCE.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new a(this.$listOfNotifications, this.$summaryGroup), 176, null);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", f = "NotificationRepository.kt", l = {541}, m = "listNotificationsForOutstanding")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class p extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(JM<? super p> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return R61.this.listNotificationsForOutstanding(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForOutstanding$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class q extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<InterfaceC2262Vt0.b> $listOfNotifications;
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ List<InterfaceC2262Vt0.b> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<InterfaceC2262Vt0.b> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                while (it.moveToNext()) {
                    String optString = it.getOptString("title");
                    String optString2 = it.getOptString("message");
                    String string = it.getString(C1575Mz0.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new InterfaceC2262Vt0.b(it.getInt("android_notification_id"), string, it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<Integer> list, List<InterfaceC2262Vt0.b> list2, JM<? super q> jm) {
            super(2, jm);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return R61.this.new q(this.$excludeAndroidIds, this.$listOfNotifications, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((q) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            StringBuilder sbRecentUninteractedWithNotificationsWhere = R61.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                sbRecentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                sbRecentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                sbRecentUninteractedWithNotificationsWhere.append(")");
            }
            InterfaceC6863ts0.a.query$default(R61.this._databaseProvider.getOs(), "notification", R61.INSTANCE.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), sbRecentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(InterfaceC1794Pt0.a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, null);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsConsumed$2", f = "NotificationRepository.kt", l = {322}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class r extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ R61 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, boolean z, boolean z2, R61 r61, int i, JM<? super r> jm) {
            super(2, jm);
            this.$summaryGroup = str;
            this.$dismissed = z;
            this.$clearGroupOnSummaryClick = z2;
            this.this$0 = r61;
            this.$androidId = i;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((r) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x008e  */
        /* JADX WARN: Code duplicated, block: B:32:0x0099  */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String[] strArr;
            String strC;
            String str;
            boolean z;
            ContentValues contentValues;
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                String str2 = this.$summaryGroup;
                String[] strArr2 = null;
                if (str2 != null) {
                    boolean zA = Intrinsics.a(str2, C6913u61.GROUPLESS_SUMMARY_KEY);
                    if (zA) {
                        str = "group_id IS NULL";
                    } else {
                        strArr2 = new String[]{this.$summaryGroup};
                        str = "group_id = ?";
                    }
                    String str3 = str;
                    String[] strArr3 = strArr2;
                    strC = str3;
                    if (this.$dismissed || this.$clearGroupOnSummaryClick) {
                        strArr = strArr3;
                    } else {
                        R61 r61 = this.this$0;
                        String str4 = this.$summaryGroup;
                        this.L$0 = strC;
                        this.Z$0 = zA;
                        this.label = 1;
                        Object androidIdForGroup = r61.getAndroidIdForGroup(str4, false, this);
                        if (androidIdForGroup == mn) {
                            return mn;
                        }
                        z = zA;
                        obj = androidIdForGroup;
                    }
                } else {
                    strArr = null;
                    strC = "android_notification_id = " + this.$androidId;
                }
                contentValues = new ContentValues();
                if (this.$dismissed) {
                    contentValues.put("dismissed", new Integer(1));
                } else {
                    contentValues.put("opened", new Integer(1));
                }
                this.this$0._databaseProvider.getOs().update("notification", contentValues, strC, strArr);
                this.this$0._badgeCountUpdater.update();
                return Unit.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            strC = (String) this.L$0;
            C1795Pt1.b(obj);
            String strValueOf = String.valueOf(obj);
            strC = Z0.c(strC, " AND android_notification_id = ?");
            strArr = z ? new String[]{strValueOf} : new String[]{this.$summaryGroup, strValueOf};
            contentValues = new ContentValues();
            if (this.$dismissed) {
                contentValues.put("dismissed", new Integer(1));
            } else {
                contentValues.put("opened", new Integer(1));
            }
            this.this$0._databaseProvider.getOs().update("notification", contentValues, strC, strArr);
            this.this$0._badgeCountUpdater.update();
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", f = "NotificationRepository.kt", l = {127}, m = "markAsDismissed")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class s extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public s(JM<? super s> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return R61.this.markAsDismissed(0, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissed$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class t extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ int $androidId;
        final /* synthetic */ C2512Yo1 $didDismiss;
        int label;
        final /* synthetic */ R61 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(C2512Yo1 c2512Yo1, R61 r61, int i, JM<? super t> jm) {
            super(2, jm);
            this.$didDismiss = c2512Yo1;
            this.this$0 = r61;
            this.$androidId = i;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((t) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            this.$didDismiss.d = this.this$0.internalMarkAsDismissed(this.$androidId);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissedForGroup$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class u extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ String $group;
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                while (it.moveToNext()) {
                    int i = it.getInt("android_notification_id");
                    if (i != -1) {
                        this.$notificationManager.cancel(i);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, JM<? super u> jm) {
            super(2, jm);
            this.$group = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return R61.this.new u(this.$group, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((u) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            NotificationManager notificationManager = C6913u61.INSTANCE.getNotificationManager(R61.this._applicationService.getAppContext());
            String[] strArr = {this.$group};
            InterfaceC6863ts0.a.query$default(R61.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, null, null, null, null, new a(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            R61.this._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
            R61.this._badgeCountUpdater.update();
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissedForOutstanding$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class v extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
                invoke2(interfaceC5604ns0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5604ns0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    do {
                        this.$notificationManager.cancel(it.getInt("android_notification_id"));
                    } while (it.moveToNext());
                }
            }
        }

        public v(JM<? super v> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return R61.this.new v(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((v) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            NotificationManager notificationManager = C6913u61.INSTANCE.getNotificationManager(R61.this._applicationService.getAppContext());
            InterfaceC6863ts0.a.query$default(R61.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new a(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            R61.this._databaseProvider.getOs().update("notification", contentValues, "opened = 0", null);
            R61.this._badgeCountUpdater.updateCount(0);
            return Unit.a;
        }
    }

    public R61(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC2184Ut0 _queryHelper, @NotNull InterfaceC7073us0 _databaseProvider, @NotNull InterfaceC4092gv0 _time, @NotNull InterfaceC2598Zr0 _badgeCountUpdater) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_queryHelper, "_queryHelper");
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int androidId) {
        Context appContext = this._applicationService.getAppContext();
        String strA = C1332Jw.a(androidId, "android_notification_id = ", " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z = this._databaseProvider.getOs().update("notification", contentValues, strA, null) > 0;
        this._badgeCountUpdater.update();
        C6913u61.INSTANCE.getNotificationManager(appContext).cancel(androidId);
        return z;
    }

    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object clearOldestOverLimitFallback(int i2, int i3, @NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new b(i3, this, i2, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object createNotification(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z, boolean z2, int i2, @Nullable String str4, @Nullable String str5, long j2, @NotNull String str6, @NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new c(str, z, i2, this, str2, str3, z2, str4, str5, j2, str6, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object createSummaryNotification(int i2, @NotNull String str, @NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new d(i2, str, this, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object deleteExpiredNotifications(@NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new e(null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object doesNotificationExist(@Nullable String str, @NotNull JM<? super Boolean> jm) {
        f fVar;
        C2512Yo1 c2512Yo1;
        if (jm instanceof f) {
            fVar = (f) jm;
            int i2 = fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.label = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(jm);
            }
        } else {
            fVar = new f(jm);
        }
        Object obj = fVar.result;
        MN mn = MN.d;
        int i3 = fVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            if (str == null || "".equals(str)) {
                return Boolean.FALSE;
            }
            C2512Yo1 c2512Yo2 = new C2512Yo1();
            ExecutorC7200vV executorC7200vV = C6266r20.c;
            g gVar = new g(str, this, c2512Yo2, null);
            fVar.L$0 = c2512Yo2;
            fVar.label = 1;
            if (C5189lv.p(executorC7200vV, gVar, fVar) == mn) {
                return mn;
            }
            c2512Yo1 = c2512Yo2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2512Yo1 = (C2512Yo1) fVar.L$0;
            C1795Pt1.b(obj);
        }
        return Boolean.valueOf(c2512Yo1.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object getAndroidIdForGroup(@NotNull String str, boolean z, @NotNull JM<? super Integer> jm) {
        h hVar;
        C3027bp1 c3027bp1;
        if (jm instanceof h) {
            hVar = (h) jm;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(jm);
            }
        } else {
            hVar = new h(jm);
        }
        Object obj = hVar.result;
        MN mn = MN.d;
        int i3 = hVar.label;
        if (i3 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(obj);
            boolean zA = Intrinsics.a(str, C6913u61.GROUPLESS_SUMMARY_KEY);
            C3027bp1 c3027bp2 = new C3027bp1();
            c3027bp2.d = zA ? "group_id IS NULL" : "group_id = ?";
            c3027bp2.d = C5807oq.b(new StringBuilder(), (String) c3027bp2.d, " AND dismissed = 0 AND opened = 0 AND ");
            StringBuilder sb = new StringBuilder();
            sb.append((String) c3027bp2.d);
            sb.append(z ? "is_summary = 1" : "is_summary = 0");
            c3027bp2.d = sb.toString();
            String[] strArr = zA ? null : new String[]{str};
            ExecutorC7200vV executorC7200vV = C6266r20.c;
            i iVar = new i(c3027bp2, strArr, c3027bp1B, null);
            hVar.L$0 = c3027bp1B;
            hVar.label = 1;
            if (C5189lv.p(executorC7200vV, iVar, hVar) == mn) {
                return mn;
            }
            c3027bp1 = c3027bp1B;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp1 = (C3027bp1) hVar.L$0;
            C1795Pt1.b(obj);
        }
        return c3027bp1.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object getAndroidIdFromCollapseKey(@NotNull String str, @NotNull JM<? super Integer> jm) {
        j jVar;
        C3027bp1 c3027bp1;
        if (jm instanceof j) {
            jVar = (j) jm;
            int i2 = jVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.label = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(jm);
            }
        } else {
            jVar = new j(jm);
        }
        Object obj = jVar.result;
        MN mn = MN.d;
        int i3 = jVar.label;
        if (i3 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(obj);
            ExecutorC7200vV executorC7200vV = C6266r20.c;
            k kVar = new k(str, c3027bp1B, null);
            jVar.L$0 = c3027bp1B;
            jVar.label = 1;
            if (C5189lv.p(executorC7200vV, kVar, jVar) == mn) {
                return mn;
            }
            c3027bp1 = c3027bp1B;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp1 = (C3027bp1) jVar.L$0;
            C1795Pt1.b(obj);
        }
        return c3027bp1.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object getGroupId(int i2, @NotNull JM<? super String> jm) {
        l lVar;
        C3027bp1 c3027bp1;
        if (jm instanceof l) {
            lVar = (l) jm;
            int i3 = lVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.label = i3 - Integer.MIN_VALUE;
            } else {
                lVar = new l(jm);
            }
        } else {
            lVar = new l(jm);
        }
        Object obj = lVar.result;
        MN mn = MN.d;
        int i4 = lVar.label;
        if (i4 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(obj);
            ExecutorC7200vV executorC7200vV = C6266r20.c;
            m mVar = new m(i2, c3027bp1B, null);
            lVar.L$0 = c3027bp1B;
            lVar.label = 1;
            if (C5189lv.p(executorC7200vV, mVar, lVar) == mn) {
                return mn;
            }
            c3027bp1 = c3027bp1B;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp1 = (C3027bp1) lVar.L$0;
            C1795Pt1.b(obj);
        }
        return c3027bp1.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object listNotificationsForGroup(@NotNull String str, @NotNull JM<? super List<InterfaceC2262Vt0.b>> jm) {
        n nVar;
        if (jm instanceof n) {
            nVar = (n) jm;
            int i2 = nVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.label = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(jm);
            }
        } else {
            nVar = new n(jm);
        }
        Object obj = nVar.result;
        MN mn = MN.d;
        int i3 = nVar.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) nVar.L$0;
            C1795Pt1.b(obj);
            return list;
        }
        C1795Pt1.b(obj);
        ArrayList arrayList = new ArrayList();
        ExecutorC7200vV executorC7200vV = C6266r20.c;
        o oVar = new o(str, this, arrayList, null);
        nVar.L$0 = arrayList;
        nVar.label = 1;
        return C5189lv.p(executorC7200vV, oVar, nVar) == mn ? mn : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object listNotificationsForOutstanding(@Nullable List<Integer> list, @NotNull JM<? super List<InterfaceC2262Vt0.b>> jm) {
        p pVar;
        if (jm instanceof p) {
            pVar = (p) jm;
            int i2 = pVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.label = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(jm);
            }
        } else {
            pVar = new p(jm);
        }
        Object obj = pVar.result;
        MN mn = MN.d;
        int i3 = pVar.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) pVar.L$0;
            C1795Pt1.b(obj);
            return list2;
        }
        C1795Pt1.b(obj);
        ArrayList arrayList = new ArrayList();
        ExecutorC7200vV executorC7200vV = C6266r20.c;
        q qVar = new q(list, arrayList, null);
        pVar.L$0 = arrayList;
        pVar.label = 1;
        return C5189lv.p(executorC7200vV, qVar, pVar) == mn ? mn : arrayList;
    }

    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object markAsConsumed(int i2, boolean z, @Nullable String str, boolean z2, @NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new r(str, z, z2, this, i2, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object markAsDismissed(int i2, @NotNull JM<? super Boolean> jm) {
        s sVar;
        C2512Yo1 c2512Yo1;
        if (jm instanceof s) {
            sVar = (s) jm;
            int i3 = sVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sVar.label = i3 - Integer.MIN_VALUE;
            } else {
                sVar = new s(jm);
            }
        } else {
            sVar = new s(jm);
        }
        Object obj = sVar.result;
        MN mn = MN.d;
        int i4 = sVar.label;
        if (i4 == 0) {
            C1795Pt1.b(obj);
            C2512Yo1 c2512Yo2 = new C2512Yo1();
            ExecutorC7200vV executorC7200vV = C6266r20.c;
            t tVar = new t(c2512Yo2, this, i2, null);
            sVar.L$0 = c2512Yo2;
            sVar.label = 1;
            if (C5189lv.p(executorC7200vV, tVar, sVar) == mn) {
                return mn;
            }
            c2512Yo1 = c2512Yo2;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2512Yo1 = (C2512Yo1) sVar.L$0;
            C1795Pt1.b(obj);
        }
        return Boolean.valueOf(c2512Yo1.d);
    }

    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object markAsDismissedForGroup(@NotNull String str, @NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new u(str, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    @Override // defpackage.InterfaceC2262Vt0
    @Nullable
    public Object markAsDismissedForOutstanding(@NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(C6266r20.c, new v(null), jm);
        return objP == MN.d ? objP : Unit.a;
    }
}
