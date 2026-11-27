package defpackage;

import androidx.annotation.NonNull;
import androidx.lifecycle.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: uR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6979uR0 extends AbstractC6769tR0 {

    @NonNull
    public final Object a;

    @NonNull
    public final c b;

    /* JADX INFO: renamed from: uR0$a */
    public static class a<D> extends W11<D> implements C6349rR0.b<D> {

        @NonNull
        public final C6349rR0<D> l;
        public Object m;
        public b<D> n;

        public a(@NonNull C6349rR0 c6349rR0) {
            this.l = c6349rR0;
            c6349rR0.registerListener(0, this);
        }

        @Override // androidx.lifecycle.LiveData
        public final void g() {
            this.l.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public final void h() {
            this.l.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void j(@NonNull InterfaceC4819k81<? super D> interfaceC4819k81) {
            super.j(interfaceC4819k81);
            this.m = null;
            this.n = null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [FP0, java.lang.Object] */
        public final void l() {
            ?? r0 = this.m;
            b<D> bVar = this.n;
            if (r0 == 0 || bVar == null) {
                return;
            }
            super.j(bVar);
            e(r0, bVar);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            C5027l8.g(this.l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: uR0$b */
    public static class b<D> implements InterfaceC4819k81<D> {

        @NonNull
        public final C6349rR0<D> a;

        @NonNull
        public final AbstractC6769tR0.a<D> b;
        public boolean c = false;

        public b(@NonNull C6349rR0<D> c6349rR0, @NonNull AbstractC6769tR0.a<D> aVar) {
            this.a = c6349rR0;
            this.b = aVar;
        }

        @Override // defpackage.InterfaceC4819k81
        public final void d(D d) {
            this.b.onLoadFinished(this.a, d);
            this.c = true;
        }

        public final String toString() {
            return this.b.toString();
        }
    }

    /* JADX INFO: renamed from: uR0$c */
    public static class c extends Qd2 {
        public static final a f = new a();
        public final C5502nO1<a> d = new C5502nO1<>();
        public boolean e = false;

        /* JADX INFO: renamed from: uR0$c$a */
        public static class a implements x.b {
            @Override // androidx.lifecycle.x.b
            @NonNull
            public final <T extends Qd2> T a(@NonNull Class<T> cls) {
                return new c();
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v6 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        @Override // defpackage.Qd2
        public final void h() {
            /*
                r9 = this;
                nO1<uR0$a> r0 = r9.d
                int r1 = r0.g()
                r2 = 0
                r3 = r2
            L8:
                if (r3 >= r1) goto L37
                java.lang.Object r4 = r0.h(r3)
                uR0$a r4 = (defpackage.C6979uR0.a) r4
                rR0<D> r5 = r4.l
                r5.cancelLoad()
                r5.abandon()
                uR0$b<D> r6 = r4.n
                if (r6 == 0) goto L2a
                r4.j(r6)
                boolean r7 = r6.c
                if (r7 == 0) goto L2a
                tR0$a<D> r7 = r6.b
                rR0<D> r8 = r6.a
                r7.onLoaderReset(r8)
            L2a:
                r5.unregisterListener(r4)
                if (r6 == 0) goto L31
                boolean r4 = r6.c
            L31:
                r5.reset()
                int r3 = r3 + 1
                goto L8
            L37:
                int r1 = r0.h
                java.lang.Object[] r3 = r0.g
                r4 = r2
            L3c:
                if (r4 >= r1) goto L44
                r5 = 0
                r3[r4] = r5
                int r4 = r4 + 1
                goto L3c
            L44:
                r0.h = r2
                r0.d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C6979uR0.c.h():void");
        }
    }

    public C6979uR0(@NonNull FP0 fp0, @NonNull Vd2 vd2) {
        this.a = fp0;
        this.b = (c) new x(vd2, c.f).a(c.class);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Deprecated
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C5502nO1<a> c5502nO1 = this.b.d;
        if (c5502nO1.g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < c5502nO1.g(); i++) {
                a aVarH = c5502nO1.h(i);
                printWriter.print(str);
                printWriter.print("  #");
                if (c5502nO1.d) {
                    c5502nO1.b();
                }
                printWriter.print(c5502nO1.e[i]);
                printWriter.print(": ");
                printWriter.println(aVarH.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                C6349rR0<D> c6349rR0 = aVarH.l;
                printWriter.println(c6349rR0);
                c6349rR0.dump(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (aVarH.n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVarH.n);
                    b<D> bVar = aVarH.n;
                    bVar.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(c6349rR0.dataToString(aVarH.d()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(aVarH.c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C5027l8.g(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
