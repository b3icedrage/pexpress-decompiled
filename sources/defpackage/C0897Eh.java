package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.n;
import androidx.fragment.app.a;
import androidx.fragment.app.g;
import androidx.fragment.app.i;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0897Eh {

    @NotNull
    public final ArrayList a;

    @NotNull
    public final g b;
    public final int c;

    @NotNull
    public final FragmentManager d;

    @NotNull
    public final i e;

    public C0897Eh(g gVar) {
        FragmentManager supportFragmentManager = gVar.getSupportFragmentManager();
        Intrinsics.b(supportFragmentManager, "activity.supportFragmentManager");
        i iVar = new i();
        this.b = gVar;
        this.c = R.id.container;
        this.d = supportFragmentManager;
        this.e = iVar;
        this.a = new ArrayList();
    }

    public void c(@NotNull InterfaceC5263mF interfaceC5263mF) {
        throw null;
    }

    public final void d(@NotNull InterfaceC5263mF[] commands) {
        Intrinsics.d(commands, "commands");
        FragmentManager fragmentManager = this.d;
        fragmentManager.x(true);
        fragmentManager.C();
        ArrayList arrayList = this.a;
        arrayList.clear();
        ArrayList<a> arrayList2 = fragmentManager.d;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        for (int i = 0; i < size; i++) {
            a aVar = fragmentManager.d.get(i);
            Intrinsics.b(aVar, "fragmentManager.getBackStackEntryAt(i)");
            String str = aVar.getName();
            Intrinsics.b(str, "str");
            Intrinsics.checkNotNullParameter(str, "<this>");
            int length = str.length() - 1;
            if (length < 0) {
                length = 0;
            }
            arrayList.add(new C5227m42(KS1.B(length, str), KS1.A(str) == '+' ? C5227m42.a.ADD : C5227m42.a.REPLACE));
        }
        for (InterfaceC5263mF command : commands) {
            try {
                c(command);
            } catch (RuntimeException e) {
                Intrinsics.d(command, "command");
                throw e;
            }
        }
    }

    public void e(@NotNull C5171lp command) {
        Intrinsics.d(command, "command");
        FragmentManager fragmentManager = this.d;
        ArrayList arrayList = this.a;
        C0667Bi0 c0667Bi0 = command.a;
        if (c0667Bi0 == null) {
            arrayList.clear();
            fragmentManager.getClass();
            fragmentManager.v(fragmentManager.new n(null, -1, 1), false);
            return;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.a(((C5227m42) it.next()).a, c0667Bi0.b)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            arrayList.clear();
            fragmentManager.getClass();
            fragmentManager.v(fragmentManager.new n(null, -1, 1), false);
        } else {
            List listSubList = arrayList.subList(i, arrayList.size());
            String string = ((C5227m42) CollectionsKt.F(listSubList)).toString();
            fragmentManager.getClass();
            fragmentManager.v(fragmentManager.new n(string, -1, 0), false);
            listSubList.clear();
        }
    }
}
