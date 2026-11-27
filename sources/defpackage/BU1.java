package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LBU1;", "LiM1;", "LAU1;", "Lsu0;", "prefs", "<init>", "(Lsu0;)V", "", "models", "", "tag", "", "replaceAll", "(Ljava/util/List;Ljava/lang/String;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class BU1 extends C4395iM1<AU1> {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LAU1;", "invoke", "()LAU1;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function0<AU1> {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final AU1 invoke() {
            return new AU1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BU1(@NotNull InterfaceC6659su0 prefs) {
        super(a.INSTANCE, "subscriptions", prefs);
        Intrinsics.checkNotNullParameter(prefs, "prefs");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.L01, defpackage.InterfaceC7076ut0
    public void replaceAll(@NotNull List<AU1> models, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!Intrinsics.a(tag, "HYDRATE")) {
            super.replaceAll(models, tag);
            return;
        }
        synchronized (models) {
            try {
                for (AU1 au1 : models) {
                    if (au1.getType() == HU1.PUSH) {
                        AU1 au2 = (AU1) get(au1.getId());
                        if (au2 == null) {
                            break;
                        }
                        au1.setSdk(au2.getSdk());
                        au1.setDeviceOS(au2.getDeviceOS());
                        au1.setCarrier(au2.getCarrier());
                        au1.setAppVersion(au2.getAppVersion());
                        au1.setStatus(au2.getStatus());
                        break;
                    }
                }
                super.replaceAll(models, tag);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
