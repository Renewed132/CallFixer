# 📞 CallFixer
Makes Minecraft 1.3.2 work.

## ❓ How, why, and what

Minecraft 1.3.2, in some conditions, refuses to work.<br/>
I'm not sure why, but for example, when porting UnrestrictedEnchants to 1.3.2, I've encountered one error.<br/>
After further analysis, it turned out that Minecraft was trying to fetch its english localization file - but with wrong capitalization (en_us instead of en_US).

I'm not sure why this happened, but it happened.<br/>
It didn't happen when I was testing Renewed - neither on the start nor later (Renewed doesn't have any injection for case handling in the Language class).

## 🪴 How to use
This is a Legacy Fabric 1.3.2 mod.<br/>
You can probably find its installer on [legacyfabric.net](https://legacyfabric.net/downloads.html) (the direct Windows installer should be [here](https://maven.legacyfabric.net/net/legacyfabric/fabric-installer/1.1.1/fabric-installer-1.1.1.exe)).
