package defpackage;

import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"LS61;", "LWt0;", "LWr0;", "_applicationService", "LLt0;", "_workManager", "LVt0;", "_dataController", "LZr0;", "_badgeCountUpdater", "<init>", "(LWr0;LLt0;LVt0;LZr0;)V", "", "", "getVisibleNotifications", "()Ljava/util/List;", "", "process", "(LJM;)Ljava/lang/Object;", "LVt0$b;", "notification", "delay", "processNotification", "(LVt0$b;ILJM;)Ljava/lang/Object;", "LWr0;", "LLt0;", "LVt0;", "LZr0;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class S61 implements InterfaceC2344Wt0 {
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC2598Zr0 _badgeCountUpdater;

    @NotNull
    private final InterfaceC2262Vt0 _dataController;

    @NotNull
    private final InterfaceC1479Lt0 _workManager;

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.restoration.impl.NotificationRestoreProcessor", f = "NotificationRestoreProcessor.kt", l = {25, 28}, m = "process")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return S61.this.process(this);
        }
    }

    public S61(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC1479Lt0 _workManager, @NotNull InterfaceC2262Vt0 _dataController, @NotNull InterfaceC2598Zr0 _badgeCountUpdater) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_workManager, "_workManager");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._workManager = _workManager;
        this._dataController = _dataController;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = C6913u61.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
        if (activeNotifications.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:28:0x0067, B:30:0x006d, B:33:0x0082, B:20:0x0040, B:27:0x005f, B:23:0x004d), top: B:38:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:28:0x0067->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2344Wt0
    @Nullable
    public Object process(@NotNull JM<? super Unit> jm) {
        b bVar;
        S61 s61;
        S61 s62;
        Iterator it;
        InterfaceC2262Vt0.b bVar2;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object objListNotificationsForOutstanding = bVar.result;
        MN mn = MN.d;
        int i2 = bVar.label;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objListNotificationsForOutstanding);
                NS0.info$default("Restoring notifications", null, 2, null);
                List<Integer> visibleNotifications = getVisibleNotifications();
                InterfaceC2262Vt0 interfaceC2262Vt0 = this._dataController;
                bVar.L$0 = this;
                bVar.label = 1;
                objListNotificationsForOutstanding = interfaceC2262Vt0.listNotificationsForOutstanding(visibleNotifications, bVar);
                if (objListNotificationsForOutstanding != mn) {
                    s61 = this;
                }
                return mn;
            }
            if (i2 == 1) {
                s61 = (S61) bVar.L$0;
                C1795Pt1.b(objListNotificationsForOutstanding);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.L$1;
                s62 = (S61) bVar.L$0;
                C1795Pt1.b(objListNotificationsForOutstanding);
            }
            while (it.hasNext()) {
                bVar2 = (InterfaceC2262Vt0.b) it.next();
                bVar.L$0 = s62;
                bVar.L$1 = it;
                bVar.label = 2;
                if (s62.processNotification(bVar2, 200, bVar) == mn) {
                    return mn;
                }
            }
            s62._badgeCountUpdater.update();
            return Unit.a;
            s62 = s61;
            it = ((List) objListNotificationsForOutstanding).iterator();
            while (it.hasNext()) {
                bVar2 = (InterfaceC2262Vt0.b) it.next();
                bVar.L$0 = s62;
                bVar.L$1 = it;
                bVar.label = 2;
                if (s62.processNotification(bVar2, 200, bVar) == mn) {
                    return mn;
                }
            }
            s62._badgeCountUpdater.update();
        } catch (Throwable th) {
            NS0.error("Error restoring notification records! ", th);
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC2344Wt0
    @Nullable
    public Object processNotification(@NotNull InterfaceC2262Vt0.b bVar, int i, @NotNull JM<? super Unit> jm) {
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), bVar.getId(), bVar.getAndroidId(), new JSONObject(bVar.getFullData()), bVar.getCreatedAt(), true, false);
        if (i <= 0) {
            return Unit.a;
        }
        Object objB = IW.b(i, jm);
        return objB == MN.d ? objB : Unit.a;
    }
}
