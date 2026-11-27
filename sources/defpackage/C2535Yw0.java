package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"LYw0;", "Lcx0;", "Lkt0;", "_locationManager", "<init>", "(Lkt0;)V", "Lcx0$a;", "handlePrompt", "(LJM;)Ljava/lang/Object;", "Lkt0;", "", "getPromptKey", "()Ljava/lang/String;", "promptKey", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C2535Yw0 extends AbstractC3259cx0 {

    @NotNull
    private final InterfaceC4974kt0 _locationManager;

    /* JADX INFO: renamed from: Yw0$a */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.prompt.impl.InAppMessageLocationPrompt", f = "InAppMessageLocationPrompt.kt", l = {10}, m = "handlePrompt")
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
            return C2535Yw0.this.handlePrompt(this);
        }
    }

    public C2535Yw0(@NotNull InterfaceC4974kt0 _locationManager) {
        Intrinsics.checkNotNullParameter(_locationManager, "_locationManager");
        this._locationManager = _locationManager;
    }

    @Override // defpackage.AbstractC3259cx0
    @NotNull
    public String getPromptKey() {
        return "location";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC3259cx0
    @Nullable
    public Object handlePrompt(@NotNull JM<? super AbstractC3259cx0.a> jm) {
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
        Object objRequestPermission = aVar.result;
        MN mn = MN.d;
        int i2 = aVar.label;
        if (i2 == 0) {
            C1795Pt1.b(objRequestPermission);
            InterfaceC4974kt0 interfaceC4974kt0 = this._locationManager;
            aVar.label = 1;
            objRequestPermission = interfaceC4974kt0.requestPermission(aVar);
            if (objRequestPermission == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objRequestPermission);
        }
        boolean zBooleanValue = ((Boolean) objRequestPermission).booleanValue();
        if (zBooleanValue) {
            return AbstractC3259cx0.a.PERMISSION_GRANTED;
        }
        if (zBooleanValue) {
            throw new C6489s51();
        }
        return AbstractC3259cx0.a.PERMISSION_DENIED;
    }
}
