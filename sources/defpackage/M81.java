package defpackage;

import androidx.activity.OnBackPressedDispatcher;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class M81 extends ML0 implements Function1<C4751jp, Unit> {
    public final /* synthetic */ OnBackPressedDispatcher d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M81(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(1);
        this.d = onBackPressedDispatcher;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C4751jp c4751jp) {
        L81 l81Previous;
        C4751jp backEvent = c4751jp;
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        OnBackPressedDispatcher onBackPressedDispatcher = this.d;
        C6202qj<L81> c6202qj = onBackPressedDispatcher.b;
        ListIterator<L81> listIterator = c6202qj.listIterator(c6202qj.getG());
        do {
            if (!listIterator.hasPrevious()) {
                l81Previous = null;
                break;
            }
            l81Previous = listIterator.previous();
        } while (!l81Previous.a);
        L81 l81 = l81Previous;
        if (onBackPressedDispatcher.c != null) {
            onBackPressedDispatcher.b();
        }
        onBackPressedDispatcher.c = l81;
        if (l81 != null) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        }
        return Unit.a;
    }
}
