package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Ul0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2160Ul0 extends Exception {
    public static final StackTraceElement[] j = new StackTraceElement[0];
    public final List<Throwable> d;
    public InterfaceC3129cK0 e;
    public CS g;
    public Class<?> h;
    public final String i;

    public C2160Ul0(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof C2160Ul0)) {
            arrayList.add(th);
            return;
        }
        Iterator<Throwable> it = ((C2160Ul0) th).d.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
    }

    public static void b(List list, a aVar) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            aVar.append("Cause (");
            int i2 = i + 1;
            aVar.append(String.valueOf(i2));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C2160Ul0) {
                ((C2160Ul0) th).d(aVar);
            } else {
                c(th, aVar);
            }
            i = i2;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.d, new a(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.i);
        sb.append(this.h != null ? ", " + this.h : "");
        sb.append(this.g != null ? ", " + this.g : "");
        sb.append(this.e != null ? ", " + this.e : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        d(System.err);
    }

    public C2160Ul0(String str, List<Throwable> list) {
        this.i = str;
        setStackTrace(j);
        this.d = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        d(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        d(printWriter);
    }

    /* JADX INFO: renamed from: Ul0$a */
    public static final class a implements Appendable {
        public final Appendable d;
        public boolean e = true;

        public a(Appendable appendable) {
            this.d = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            boolean z = this.e;
            Appendable appendable = this.d;
            if (z) {
                this.e = false;
                appendable.append("  ");
            }
            this.e = c == '\n';
            appendable.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = this.e;
            Appendable appendable = this.d;
            boolean z2 = false;
            if (z) {
                this.e = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z2 = true;
            }
            this.e = z2;
            appendable.append(charSequence, i, i2);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
