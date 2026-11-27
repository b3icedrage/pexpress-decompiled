package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.jivosite.sdk.model.pojo.push.Device;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class W92 {

    @NotNull
    public final C6102qE1 a;

    @NotNull
    public final InterfaceC5889pD1 b;

    @NotNull
    public final EK1 c;

    @NotNull
    public final InterfaceC3432dl1 d;

    @NotNull
    public final InterfaceC5570ni1 e;
    public String f;

    public W92(@NotNull C6102qE1 sdkContext, @NotNull InterfaceC5889pD1 schedulers, @NotNull EK1 storage, @NotNull InterfaceC3432dl1 pushApi, @NotNull InterfaceC5570ni1 profileRepository) {
        Intrinsics.checkNotNullParameter(sdkContext, "sdkContext");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(pushApi, "pushApi");
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        this.a = sdkContext;
        this.b = schedulers;
        this.c = storage;
        this.d = pushApi;
        this.e = profileRepository;
    }

    public final void a() {
        FirebaseMessaging firebaseMessaging;
        Task<String> task;
        if (StringsKt.I(this.e.getId())) {
            return;
        }
        EK1 ek1 = this.c;
        ek1.getClass();
        IJ0<Object>[] ij0Arr = EK1.z;
        String str = (String) ek1.l.a(ij0Arr[12], ek1);
        EK1 ek2 = this.c;
        ek2.getClass();
        boolean zBooleanValue = ((Boolean) ek2.v.a(ij0Arr[24], ek2)).booleanValue();
        this.f = this.c.e();
        if (!StringsKt.I(str) || zBooleanValue) {
            if (!StringsKt.I(str) && !zBooleanValue) {
                b(str);
                this.c.g(true);
                return;
            } else {
                if (StringsKt.I(str) && zBooleanValue) {
                    b(str);
                    this.c.g(false);
                    return;
                }
                return;
            }
        }
        a aVar = FirebaseMessaging.n;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(C1198Id0.c());
        }
        InterfaceC2556Zd0 interfaceC2556Zd0 = firebaseMessaging.b;
        if (interfaceC2556Zd0 != null) {
            task = interfaceC2556Zd0.a();
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            firebaseMessaging.h.execute(new P(3, firebaseMessaging, taskCompletionSource));
            task = taskCompletionSource.getTask();
        }
        task.addOnCompleteListener(new C7680xl(this)).addOnFailureListener(new C6133qP());
    }

    public final void b(String str) {
        EK1 ek1 = this.c;
        ek1.getClass();
        IJ0<Object>[] ij0Arr = EK1.z;
        IJ0<Object> ij0 = ij0Arr[0];
        C6749tK1 c6749tK1 = ek1.a;
        if (StringsKt.I((String) c6749tK1.a(ij0, ek1))) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            Intrinsics.checkNotNullParameter(string, "<set-?>");
            c6749tK1.b(ij0Arr[0], string);
        }
        this.b.b().execute(new RunnableC3117cG0(3, this, new Device((String) c6749tK1.a(ij0Arr[0], ek1), null, str, 2, null)));
    }
}
