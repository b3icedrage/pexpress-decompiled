package defpackage;

import com.jivosite.sdk.ui.chat.JivoChatFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class E80<E> implements InterfaceC4819k81<Z70<? extends E>> {

    @NotNull
    public final JivoChatFragment.b a;

    public E80(@NotNull JivoChatFragment.b onEventUnhandledContent) {
        Intrinsics.checkNotNullParameter(onEventUnhandledContent, "onEventUnhandledContent");
        this.a = onEventUnhandledContent;
    }

    @Override // defpackage.InterfaceC4819k81
    public final void d(Object obj) {
        AbstractC7547x70 abstractC7547x70;
        Z70 z70 = (Z70) obj;
        if (z70 != null) {
            if (z70.b) {
                abstractC7547x70 = null;
            } else {
                z70.b = true;
                abstractC7547x70 = z70.a;
            }
            if (abstractC7547x70 != null) {
                this.a.invoke(abstractC7547x70);
            }
        }
    }
}
