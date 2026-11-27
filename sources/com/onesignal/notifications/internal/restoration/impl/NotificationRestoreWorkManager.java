package com.onesignal.notifications.internal.restoration.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import defpackage.AbstractC4477ik2;
import defpackage.C1795Pt1;
import defpackage.C6913u61;
import defpackage.C7766y91;
import defpackage.EnumC5957pa0;
import defpackage.I71;
import defpackage.InterfaceC2344Wt0;
import defpackage.InterfaceC2448Xt0;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.K91;
import defpackage.LM;
import defpackage.MN;
import defpackage.R51;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/onesignal/notifications/internal/restoration/impl/NotificationRestoreWorkManager;", "LXt0;", "<init>", "()V", "Landroid/content/Context;", "context", "", "shouldDelay", "", "beginEnqueueingWork", "(Landroid/content/Context;Z)V", "restored", "Z", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "NotificationRestoreWorker", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NotificationRestoreWorkManager implements InterfaceC2448Xt0 {
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private boolean restored;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/internal/restoration/impl/NotificationRestoreWorkManager$NotificationRestoreWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(LJM;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NotificationRestoreWorker extends CoroutineWorker {

        @InterfaceC3368dU(c = "com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager$NotificationRestoreWorker", f = "NotificationRestoreWorkManager.kt", l = {61}, m = "doWork")
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a extends LM {
            int label;
            /* synthetic */ Object result;

            public a(JM<? super a> jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationRestoreWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.work.CoroutineWorker
        @Nullable
        public Object doWork(@NotNull JM<? super c.a> jm) {
            a aVar;
            if (jm instanceof a) {
                aVar = (a) jm;
                int i = aVar.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.label = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(jm);
                }
            } else {
                aVar = new a(jm);
            }
            Object obj = aVar.result;
            MN mn = MN.d;
            int i2 = aVar.label;
            if (i2 == 0) {
                C1795Pt1.b(obj);
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                if (!C7766y91.c(applicationContext)) {
                    c.a.C0243c c0243c = new c.a.C0243c();
                    Intrinsics.checkNotNullExpressionValue(c0243c, "success()");
                    return c0243c;
                }
                if (!C6913u61.areNotificationsEnabled$default(C6913u61.INSTANCE, applicationContext, null, 2, null)) {
                    c.a.C0242a c0242a = new c.a.C0242a();
                    Intrinsics.checkNotNullExpressionValue(c0242a, "failure()");
                    return c0242a;
                }
                InterfaceC2344Wt0 interfaceC2344Wt0 = (InterfaceC2344Wt0) C7766y91.b().getService(InterfaceC2344Wt0.class);
                aVar.label = 1;
                if (interfaceC2344Wt0.process(aVar) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            c.a.C0243c c0243c2 = new c.a.C0243c();
            Intrinsics.checkNotNullExpressionValue(c0243c2, "success()");
            return c0243c2;
        }
    }

    @Override // defpackage.InterfaceC2448Xt0
    public void beginEnqueueingWork(@NotNull Context context, boolean shouldDelay) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (Boolean.valueOf(this.restored)) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            Unit unit = Unit.a;
            int i = shouldDelay ? 15 : 0;
            K91.a aVar = new K91.a(NotificationRestoreWorker.class);
            long j = i;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            K91 k91A = ((K91.a) aVar.d(j)).a();
            AbstractC4477ik2 i71 = I71.INSTANCE.getInstance(context);
            String str = NOTIFICATION_RESTORE_WORKER_IDENTIFIER;
            EnumC5957pa0 enumC5957pa0 = EnumC5957pa0.e;
            i71.getClass();
            i71.a(str, enumC5957pa0, Collections.singletonList(k91A));
        }
    }
}
