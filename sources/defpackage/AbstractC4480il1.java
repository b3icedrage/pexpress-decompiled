package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.onesignal.common.AndroidUtils;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: il1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b \u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000fJ\u0013\u0010\u001e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010(\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lil1;", "Luu0;", "Lvu0;", "Lws0;", "_deviceService", "LxI;", "_configModelStore", "LEm0;", "_upgradePrompt", "<init>", "(Lws0;LxI;LEm0;)V", "", "senderId", "Luu0$a;", "internalRegisterForPush", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "registerInBackground", "", "currentRetry", "attemptRegistration", "(Ljava/lang/String;ILJM;)Ljava/lang/Object;", "", "throwable", "LGU1;", "pushStatusFromThrowable", "(Ljava/lang/Throwable;)LGU1;", "", "isValidProjectNumber", "(Ljava/lang/String;)Z", "getToken", "registerForPush", "(LJM;)Ljava/lang/Object;", "id", "", "fireCallback", "Lws0;", "LxI;", "LEm0;", "getProviderName", "()Ljava/lang/String;", "providerName", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AbstractC4480il1 implements InterfaceC7079uu0, InterfaceC7289vu0 {
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;

    @NotNull
    private C7582xI _configModelStore;

    @NotNull
    private final InterfaceC7494ws0 _deviceService;

    @NotNull
    private final C0913Em0 _upgradePrompt;

    /* JADX INFO: renamed from: il1$b */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle", f = "PushRegistratorAbstractGoogle.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "attemptRegistration")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        int I$0;
        Object L$0;
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
            return AbstractC4480il1.this.attemptRegistration(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: il1$c */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle", f = "PushRegistratorAbstractGoogle.kt", l = {84, ModuleDescriptor.MODULE_VERSION}, m = "internalRegisterForPush")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(JM<? super c> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbstractC4480il1.this.internalRegisterForPush(null, this);
        }
    }

    /* JADX INFO: renamed from: il1$d */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle", f = "PushRegistratorAbstractGoogle.kt", l = {108, 113}, m = "registerInBackground")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(JM<? super d> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbstractC4480il1.this.registerInBackground(null, this);
        }
    }

    public AbstractC4480il1(@NotNull InterfaceC7494ws0 _deviceService, @NotNull C7582xI _configModelStore, @NotNull C0913Em0 _upgradePrompt) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_upgradePrompt, "_upgradePrompt");
        this._deviceService = _deviceService;
        this._configModelStore = _configModelStore;
        this._upgradePrompt = _upgradePrompt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00d5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00f0, please report this as an issue */
    public final Object attemptRegistration(String str, int i, JM<? super InterfaceC7079uu0.a> jm) {
        b bVar;
        AbstractC4480il1 abstractC4480il1;
        GU1 gu1PushStatusFromThrowable;
        String rootCauseMessage;
        Exception exc;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object token = bVar.result;
        MN mn = MN.d;
        int i3 = bVar.label;
        if (i3 == 0) {
            C1795Pt1.b(token);
            try {
                bVar.L$0 = this;
                bVar.I$0 = i;
                bVar.label = 1;
                token = getToken(str, bVar);
                if (token == mn) {
                    return mn;
                }
                abstractC4480il1 = this;
            } catch (IOException e) {
                e = e;
                abstractC4480il1 = this;
                gu1PushStatusFromThrowable = abstractC4480il1.pushStatusFromThrowable(e);
                rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage)) {
                }
                exc = new Exception(e);
                if (i >= 4) {
                    NS0.error("Retry count of 5 exceed! Could not get a " + abstractC4480il1.getProviderName() + " Token.", exc);
                } else {
                    NS0.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i, exc);
                    if (i == 2) {
                        return new InterfaceC7079uu0.a(null, gu1PushStatusFromThrowable);
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                abstractC4480il1 = this;
                NS0.error("Unknown error getting " + abstractC4480il1.getProviderName() + " Token", th);
                return new InterfaceC7079uu0.a(null, GU1.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = bVar.I$0;
            abstractC4480il1 = (AbstractC4480il1) bVar.L$0;
            try {
                C1795Pt1.b(token);
            } catch (IOException e2) {
                e = e2;
                gu1PushStatusFromThrowable = abstractC4480il1.pushStatusFromThrowable(e);
                rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage) && !"AUTHENTICATION_FAILED".equals(rootCauseMessage)) {
                    NS0.error("Error Getting " + abstractC4480il1.getProviderName() + " Token", new Exception(e));
                    return new InterfaceC7079uu0.a(null, gu1PushStatusFromThrowable);
                }
                exc = new Exception(e);
                if (i >= 4) {
                    NS0.error("Retry count of 5 exceed! Could not get a " + abstractC4480il1.getProviderName() + " Token.", exc);
                } else {
                    NS0.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i, exc);
                    if (i == 2) {
                        return new InterfaceC7079uu0.a(null, gu1PushStatusFromThrowable);
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                NS0.error("Unknown error getting " + abstractC4480il1.getProviderName() + " Token", th);
                return new InterfaceC7079uu0.a(null, GU1.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
            }
        }
        String str2 = (String) token;
        NS0.info$default("Device registered, push token = " + str2, null, 2, null);
        return new InterfaceC7079uu0.a(str2, GU1.SUBSCRIBED);
    }

    public static /* synthetic */ Object fireCallback$suspendImpl(AbstractC4480il1 abstractC4480il1, String str, JM jm) throws Exception {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [il1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [il1] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final Object internalRegisterForPush(String str, JM<? super InterfaceC7079uu0.a> jm) {
        c cVar;
        if (jm instanceof c) {
            cVar = (c) jm;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(jm);
            }
        } else {
            cVar = new c(jm);
        }
        Object objRegisterInBackground = cVar.result;
        MN mn = MN.d;
        int i2 = cVar.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    C1795Pt1.b(objRegisterInBackground);
                    return (InterfaceC7079uu0.a) objRegisterInBackground;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objRegisterInBackground);
                NS0.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                return new InterfaceC7079uu0.a(null, GU1.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
            }
            C1795Pt1.b(objRegisterInBackground);
            try {
                if (this._deviceService.isGMSInstalledAndEnabled()) {
                    cVar.L$0 = this;
                    cVar.label = 1;
                    objRegisterInBackground = registerInBackground(str, cVar);
                    if (objRegisterInBackground != mn) {
                        return (InterfaceC7079uu0.a) objRegisterInBackground;
                    }
                } else {
                    C0913Em0 c0913Em0 = this._upgradePrompt;
                    cVar.L$0 = this;
                    cVar.label = 2;
                    if (c0913Em0.showUpdateGPSDialog(cVar) != mn) {
                        NS0.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new InterfaceC7079uu0.a(null, GU1.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    }
                }
                return mn;
            } catch (Throwable th) {
                th = th;
                str = this;
                NS0.error("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                return new InterfaceC7079uu0.a(null, GU1.FIREBASE_FCM_INIT_ERROR);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final boolean isValidProjectNumber(String senderId) {
        try {
            Intrinsics.checkNotNull(senderId);
            Float.parseFloat(senderId);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final GU1 pushStatusFromThrowable(Throwable throwable) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(throwable);
        if (!(throwable instanceof IOException)) {
            return GU1.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
        }
        if (Intrinsics.a(rootCauseMessage, "SERVICE_NOT_AVAILABLE")) {
            return GU1.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE;
        }
        return Intrinsics.a(rootCauseMessage, "AUTHENTICATION_FAILED") ? GU1.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : GU1.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER;
    }

    public static /* synthetic */ Object registerForPush$suspendImpl(AbstractC4480il1 abstractC4480il1, JM jm) {
        if (!abstractC4480il1._configModelStore.getModel().isInitializedWithRemote()) {
            return new InterfaceC7079uu0.a(null, GU1.FIREBASE_FCM_INIT_ERROR);
        }
        if (!abstractC4480il1._deviceService.getHasFCMLibrary()) {
            NS0.fatal$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new InterfaceC7079uu0.a(null, GU1.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!abstractC4480il1.isValidProjectNumber(abstractC4480il1._configModelStore.getModel().getGoogleProjectNumber())) {
            NS0.error$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new InterfaceC7079uu0.a(null, GU1.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = abstractC4480il1._configModelStore.getModel().getGoogleProjectNumber();
        Intrinsics.checkNotNull(googleProjectNumber);
        return abstractC4480il1.internalRegisterForPush(googleProjectNumber, jm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (defpackage.IW.b(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:29:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object registerInBackground(java.lang.String r10, defpackage.JM<? super defpackage.InterfaceC7079uu0.a> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.AbstractC4480il1.d
            if (r0 == 0) goto L13
            r0 = r11
            il1$d r0 = (defpackage.AbstractC4480il1.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            il1$d r0 = new il1$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$0
            il1 r5 = (defpackage.AbstractC4480il1) r5
            defpackage.C1795Pt1.b(r11)
            goto L7f
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$0
            il1 r5 = (defpackage.AbstractC4480il1) r5
            defpackage.C1795Pt1.b(r11)
            goto L66
        L4a:
            defpackage.C1795Pt1.b(r11)
            r11 = 0
            r2 = r9
        L4f:
            r5 = 5
            if (r11 >= r5) goto L84
            r0.L$0 = r2
            r0.L$1 = r10
            r0.I$0 = r11
            r0.label = r4
            java.lang.Object r5 = r2.attemptRegistration(r10, r11, r0)
            if (r5 != r1) goto L61
            goto L7e
        L61:
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r5
            r5 = r8
        L66:
            uu0$a r11 = (defpackage.InterfaceC7079uu0.a) r11
            if (r11 == 0) goto L6b
            return r11
        L6b:
            int r11 = r10 + 1
            int r11 = r11 * 10000
            long r6 = (long) r11
            r0.L$0 = r5
            r0.L$1 = r2
            r0.I$0 = r10
            r0.label = r3
            java.lang.Object r11 = defpackage.IW.b(r6, r0)
            if (r11 != r1) goto L7f
        L7e:
            return r1
        L7f:
            int r11 = r10 + 1
            r10 = r2
            r2 = r5
            goto L4f
        L84:
            uu0$a r10 = new uu0$a
            r11 = 0
            GU1 r0 = defpackage.GU1.FIREBASE_FCM_INIT_ERROR
            r10.<init>(r11, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4480il1.registerInBackground(java.lang.String, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC7289vu0
    @Nullable
    public Object fireCallback(@Nullable String str, @NotNull JM<? super Unit> jm) {
        return fireCallback$suspendImpl(this, str, jm);
    }

    @NotNull
    public abstract String getProviderName();

    @Nullable
    public abstract Object getToken(@NotNull String str, @NotNull JM<? super String> jm);

    @Override // defpackage.InterfaceC7079uu0
    @Nullable
    public Object registerForPush(@NotNull JM<? super InterfaceC7079uu0.a> jm) {
        return registerForPush$suspendImpl(this, jm);
    }
}
