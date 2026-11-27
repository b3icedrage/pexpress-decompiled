package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: op0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5805op0 extends M {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final C5595np0 a = new C5595np0();
    public boolean c = false;
    public C1868Qs d = new C1868Qs();

    /* JADX INFO: renamed from: op0$a */
    public static class a extends N {
        @Override // defpackage.InterfaceC2102Ts
        public final C3037bt a(N20 n20, N20.a aVar) {
            int i = n20.e;
            CharSequence charSequence = n20.a;
            if (n20.g >= 4 || charSequence.charAt(i) != '<') {
                return null;
            }
            for (int i2 = 1; i2 <= 7; i2++) {
                if (i2 != 7 || !(aVar.a.f() instanceof C1349Kb1)) {
                    Pattern[] patternArr = C5805op0.e[i2];
                    Pattern pattern = patternArr[0];
                    Pattern pattern2 = patternArr[1];
                    if (pattern.matcher(charSequence.subSequence(i, charSequence.length())).find()) {
                        C3037bt c3037bt = new C3037bt(new C5805op0(pattern2));
                        c3037bt.b = n20.b;
                        return c3037bt;
                    }
                }
            }
            return null;
        }
    }

    public C5805op0(Pattern pattern) {
        this.b = pattern;
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final void b() {
        this.d.a.toString();
        this.a.getClass();
        this.d = null;
    }

    @Override // defpackage.InterfaceC2024Ss
    public final C1946Rs c(N20 n20) {
        if (this.c) {
            return null;
        }
        if (n20.h && this.b == null) {
            return null;
        }
        return C1946Rs.a(n20.b);
    }

    @Override // defpackage.InterfaceC2024Ss
    public final AbstractC1634Ns f() {
        return this.a;
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final void h(CharSequence charSequence) {
        C1868Qs c1868Qs = this.d;
        int i = c1868Qs.b;
        StringBuilder sb = c1868Qs.a;
        if (i != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        c1868Qs.b++;
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.c = true;
    }
}
