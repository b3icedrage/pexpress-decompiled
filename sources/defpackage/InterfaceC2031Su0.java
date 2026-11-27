package defpackage;

import defpackage.D01;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Su0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2031Su0<TModel extends D01> extends InterfaceC0775Cs0<InterfaceC2109Tu0<TModel>> {

    /* JADX INFO: renamed from: Su0$a */
    public static final class a {
        public static /* synthetic */ void replace$default(InterfaceC2031Su0 interfaceC2031Su0, D01 d01, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
            }
            if ((i & 2) != 0) {
                str = "NORMAL";
            }
            interfaceC2031Su0.replace(d01, str);
        }
    }

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ boolean getHasSubscribers();

    @NotNull
    TModel getModel();

    void replace(@NotNull TModel tmodel, @NotNull String str);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void subscribe(Object obj);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void unsubscribe(Object obj);
}
