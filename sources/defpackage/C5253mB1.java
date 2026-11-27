package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5253mB1 {

    @NotNull
    public final C5473nF a = new C5473nF();

    public final void a(@NotNull InterfaceC5263mF... commands) {
        Intrinsics.d(commands, "commands");
        C5473nF c5473nF = this.a;
        c5473nF.getClass();
        C4701jc c4701jc = (C4701jc) c5473nF.a;
        if (c4701jc != null) {
            c4701jc.d(commands);
        } else {
            ((ArrayList) c5473nF.b).add(commands);
        }
    }

    public final void b() {
        a(new C4532ip());
    }

    public final void c(@NotNull C0589Ai0 screen, boolean z) {
        Intrinsics.d(screen, "screen");
        a(new C1288Jh0(screen, z));
    }

    public final void d(@NotNull AbstractC2307Wh[] abstractC2307WhArr) {
        ArrayList arrayList = new ArrayList(abstractC2307WhArr.length);
        for (AbstractC2307Wh abstractC2307Wh : abstractC2307WhArr) {
            arrayList.add(new C1288Jh0(abstractC2307Wh, false));
        }
        C4952km0 c4952km0 = new C4952km0(2);
        c4952km0.a(new C5171lp(null));
        Object[] array = arrayList.toArray(new C1288Jh0[0]);
        if (array == null) {
            throw new C5865p62("null cannot be cast to non-null type kotlin.Array<T>");
        }
        c4952km0.b(array);
        ArrayList arrayList2 = (ArrayList) c4952km0.a;
        a((InterfaceC5263mF[]) arrayList2.toArray(new InterfaceC5263mF[arrayList2.size()]));
    }

    public final void e(@NotNull C0667Bi0 screen) {
        Intrinsics.d(screen, "screen");
        a(new C5171lp(null), new C1789Pr1(screen));
    }
}
